/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Starting daemon threads
 *
 * Lets main thread and all forked thread finish before daemond threads
 *
 * The main thread is a non-daemond thread
 *
 * Daemon threads are low-priority threads whose only role is to provide services to user threads.
 *
 * Since daemon threads are meant to serve user threads and are only needed while user threads are running.
 *   They will not prevent the JVM from exiting once all user threads have finished their execution.
 *   That's why infinite loops, which typically exist in daemon threads, will not cause problems, because any code, 
 *   including the finally blocks, won't be executed once all user threads have finished their execution. 
 * For this reason, daemon threads are not recommended for I/O tasks.
 *   https://www.baeldung.com/java-daemon-thread
 */
public class Example_05 extends Thread{

  private static int threadNumber = 0;
  private int loopCount = 1;

  public Example_05(){

    super("" + ++threadNumber);

    switch((int)(Math.random() * 3)){

      case 0:
        this.setPriority(MIN_PRIORITY);
        break;

      case 1:
        this.setPriority(NORM_PRIORITY);
        break;

      case 2:
        this.setPriority(MAX_PRIORITY);
        break;
    }

    /*
     * setDaemon() must be called before start
     *
     * When all non-daemon threads complete, an application terminates
     *
     * main() is a non-daemon thread
     *
     */
    switch((int)(Math.random() * 2)){

      case 0:
        this.setDaemon(true);
        System.out.println("Thread #" + threadNumber + " is a Daemon Thread");
        break;

      case 1:
        this.setDaemon(false);
        System.out.println("Thread #" + threadNumber + " is a NOT Daemon Thread");
        break;
    }
  }

  @Override
  public String toString(){

    return ("Thread #" + this.getName() + "Priority = " + this.getPriority() + ": Loop count " + loopCount);
  }

  @Override
  public void run(){

    while(true){

      if(loopCount < 100){

        ++loopCount;
      }
      else{

        System.out.println("\t\tThread #" + this.getName() + " Priority = " + this.getPriority() + " is complete.");
        System.out.println("this.isDaemon() = " + this.isDaemon());

        /*
         * Exits run, stopping the thread
         */
        return;
      }

      try{

        if(this.isDaemon()){

          sleep(500);
        }
        else{

          sleep(10);
        }
      }
      catch(InterruptedException exception){

        exception.printStackTrace();
      }
      catch(Exception exception){

        exception.printStackTrace();
      }
    }
  }

  public static void main(String[] args){

    for(int i = 0; i < 10; i++){

      new Example_05().start();
    }

    System.out.println("All threads have been started.");
  }
}
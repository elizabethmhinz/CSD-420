/* 
 * Professor Darrell Payne
 * Bellevue University
 *
 * Thread using join
 * Constructor takes a thread as a parameter
 * Calls join
 */
public class Joiner1 extends Thread{

  private int loopCount = 1;
  private Thread myRefToThread = null;
  private static int threadNumber = 0;

  public Joiner1(String name, Thread thread){

    super(name);
    ++threadNumber;
    this.myRefToThread = thread;
    myRefToThread.start();
  }

  @Override
  public String toString(){

    return ("Thread " + getName() + ": Loop count " + loopCount);
  }

  @Override
  public void run(){

    try{
    /*
     * Calling join on a thread, the calling thread is suspended until
     *   the target thread is complete
     * Waits until the target thread is complete
     */
    myRefToThread.join();

    /*
     * Calling join with a timeout argument set a maximum time to wait
     * If at the end of that time the joining thread is not complete
     *   the calling thread will continue
     *
     *   myRefToThread.join(1);
     */
    System.out.println("\t\tThread " + getName() + " is started.");

    while(true){

      System.out.println(this);

        if(loopCount < 25){

          ++loopCount;
        }
        else{

          System.out.println("\t\tThread " + getName() + " is complete.");
          return;
        }

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
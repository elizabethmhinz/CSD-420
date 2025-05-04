/*
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implementing Runnable
 */
public class Example_13{

  public static void main(String[] args){

    Runnable_13 runnable_a = new Runnable_13(45);
    Runnable_13 runnable_b = new Runnable_13(20);
    Runnable_13 runnable_c = new Runnable_13(5);

    Thread thread_a = new Thread(runnable_a);
    Thread thread_b = new Thread(runnable_b);
    Thread thread_c = new Thread(runnable_c);

    thread_a.setName("Thread 1");
    thread_b.setName("Thread 2");
    thread_c.setName("Thread 3");

    /*
     * The following three lines would not create new threads
     *
     * thread_a.run();
     * thread_b.run();
     * thread_c.run();
     */
    thread_a.start();
    thread_b.start();
    thread_c.start();

    System.out.println("Main method has ended.");
  }
}

class Runnable_13 implements Runnable{

  int milliseconds;

  public Runnable_13(int i){

    milliseconds = i;
  }

  @Override
  public void run(){

    for(int i = 0; i < 50; i++){

      System.out.println("Thread " + Thread.currentThread().getName() + " loop number " + ( i + 1 ));

      try{

        // Thread sleeps
        Thread.sleep(this.milliseconds);
      }
      catch(Exception e){

        e.printStackTrace();
      }
    }

    System.out.println("\t\tThread " + Thread.currentThread().getName() + " is now complete.");
  }
}
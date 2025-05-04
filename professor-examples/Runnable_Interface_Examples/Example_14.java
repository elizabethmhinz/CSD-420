/*
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implementing Runnable
 *
 * Graceful way to stop a thread
 */
public class Example_14{

  public static void main(String[] args){

    Runnable_14 runnable_a = new Runnable_14();
    Runnable_14 runnable_b = new Runnable_14();
    Runnable_14 runnable_c = new Runnable_14();
    Runnable_14 runnable_d = new Runnable_14();

    Thread thread_a = new Thread(runnable_a);
    Thread thread_b = new Thread(runnable_b);
    Thread thread_c = new Thread(runnable_c);
    Thread thread_d = new Thread(runnable_d);

    thread_a.setName("Thread A");
    thread_b.setName("Thread B");
    thread_c.setName("Thread C");
    thread_d.setName("Thread D");

    /*
     * The following three lines create no new threads
     *
     * thread_a.run();
     * thread_b.run();
     * thread_c.run();
     */
    thread_a.start();
    thread_b.start();
    thread_c.start();
    thread_d.start();

    try{

      Thread.sleep(1000);
    }
    catch(Exception e){

      e.printStackTrace();
    }

    runnable_a.stopRunning();
    runnable_b.stopRunning();
    runnable_c.stopRunning();
    runnable_d.stopRunning();

    System.out.println("Main method has ended.");
    }
  }

class Runnable_14 implements Runnable{

  int counter;
  boolean timeToStop = false;

  @Override
  public void run(){

    while( ! timeToStop){

      counter++;

      try{

        Thread.sleep((int)(Math.random() * 10 + 1));
      }
      catch(Exception e){

        e.printStackTrace();
      }
    }
  }

  public void stopRunning(){

    timeToStop = true;
    System.out.println("Thread " + Thread.currentThread().getName() + " has executed " + counter + " times.");
  }
}
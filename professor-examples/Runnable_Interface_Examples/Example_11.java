/* 
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implementing Runnable
 *
 * Runnable_11 implements Runnable
 *
 * Create one new thread
 *
 * Runnable interface is the primary template for any object that is intended to be executed by a thread. 
 *  It defines a single method run(), which is meant to contain the code that is executed by the thread.
 *  Any class whose instance needs to be executed by a thread should implement the Runnable interface.
 *  The Thread class itself implements Runnable with an empty implementation of run() method.
 *
 * https://www.callicoder.com/java-multithreading-thread-and-runnable-tutorial/
 *
 */
public class Example_11{

  public static void main(String[] args){

    Runnable_11 runnable1 = new Runnable_11();

    /*
     * Create new Thread instance
     */
    Thread thread = new Thread(runnable1);

    /*
     * Invoking start from the Thread class causes the run()
     *   method to "fork" into a new thread of execution
     *
     * The start() method is invoked on the Thread instance,
     *    not the Runnable interface
     */
    thread.start();

    System.out.println("Main method has ended.");
    System.out.println("Still waiting on non-daemon threads to complete.");
  }
}

// We can only extend a single class
class Runnable_11 implements Runnable{

  // Method run(), executed by the thread
  @Override
  public void run(){

    for(int i = 0; i < 10; i++){

      System.out.println("Runnable_07 loop number " + ( i + 1 ));
    }
  }
}
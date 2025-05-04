/*
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implementing Runnable
 */
public class Example_12{

  public static void main(String[] args){

    Runnable_12 runnable_a = new Runnable_12();
    Runnable_12 runnable_b = new Runnable_12();
    Runnable_12 runnable_c = new Runnable_12();

    Thread thread_a = new Thread(runnable_a);
    Thread thread_b = new Thread(runnable_b);
    Thread thread_c = new Thread(runnable_c);

    thread_a.setName("Thread 1");
    thread_b.setName("Thread 2");
    thread_c.setName("Thread 3");

    thread_a.start();
    thread_b.start();
    thread_c.start();

    System.out.println("Main method has ended.");
  }
}

class Runnable_12 implements Runnable{

  @Override
  public void run(){

    for(int i = 0; i < 35; i++){

      System.out.println("Thread " + Thread.currentThread().getName() + " loop number " + ( i + 1 ));
    }

    System.out.println("\t\tThread " + Thread.currentThread().getName() + " is now complete.");
  }
}
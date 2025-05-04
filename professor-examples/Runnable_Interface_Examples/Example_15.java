/*
 * Professor Darrell Payne
 * Bellevue University
 *
 * Implementing the runnable interface
 *  Using synchronized
 *
 * The goal is to get only 10000s output
 *   this example will work
 * i and the sync method belongs to the Object
 */
public class Example_15 implements Runnable{

  /*
   * make i static - class variable
   */
  static int i = 0;
  private static int threadNumber = 0;

  @Override
  public void run(){

    Example_15.runNumbers();
  }

  /*
   * static sync method aquires Class Object lock
   * Only one may execute per Calss Object
   * I only get 1000s
   */
  synchronized static private void runNumbers(){

    for(i = 0; i < 10000; i++);

    try{

      Thread.currentThread().sleep(1);
    }
    catch(Exception exception){

      exception.printStackTrace();
    }

    System.out.println(i);

    for(i = 10000; i > 0; i--);

  }

  public static void main(String[] args){

    for(int i = 0; i < 100; i++){

      new Thread(new Example_15()).start();
    }
  }
}
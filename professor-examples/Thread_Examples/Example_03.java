/*
 * Professor Darrell Payne
 * Bellevue University
 * 
 * sleep()
 *
 * sleep will not release the object lock
 *
 */
public class Example_03 extends Thread{

  private static int threadNumber = 0;
  private int loopCount = 1;

  public Example_03(){

    super("" + ++threadNumber);
  }

  @Override
  public String toString(){

    return ("Thread #" + this.getName() + " : Loop count " + loopCount);
  }

  @Override
  public void run(){

    while(true){

      System.out.println(this);

      if(loopCount < 100){

        ++loopCount;
      }
      else{

        System.out.println("\t\tThread #" + this.getName() + " is complete.");
        return;
      }

      /*
       * Parameter is number of milliseconds to sleep
       *
       * Indicates the minimum time it will sleep, not the maximum
       */
      try{

        /*
         * invoke of sleep must be in a try catch structure
         *
         * This method causes the currently executing thread to 
         *   sleep for the specified (minimum) number of milliseconds 
         *
         */
        //sleep((int)(Math.random() * 100));
         sleep(50);

        /*
         *
         * 50 milliseconds
         * sleep(50);
         *
         * 300 milliseconds
         * sleep(300);
         *
         * etc.
         *
         */
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

      new Example_03().start();
    }
  }
}
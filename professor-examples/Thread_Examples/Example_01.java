/*
 * Professor Darrell Payne
 * Bellevue University
 * Simple Thread
 *
 * Extending the Thread class
 */
public class Example_01 extends Thread{

  private static int threadNumber = 0;
  private int loopCount = 1;

  public Example_01(){

    /*
     * Call to super() or this() must be first statement in constructor
     * Sets the name of the thread 
     * class Example_01 extends Thread
     */
    super("" + ++threadNumber);

    /*
     * run()
     *
     * What is the result of calling run()
     * Compile error?
     * Runtime error?
     * Compile and run with no error?
     * Results different than expected?
     *
     * Result would be a single thread application
     */
    start();
  }

  @Override
  public String toString(){

    /*
     * The getName() method return the String name of the current thread
     */
    return ("Thread #" + this.getName() + ": Loop count " + loopCount);
  }

  /*
   * When extending Thread, you must override:
   *
   *   public void run();
   */
  @Override
  public void run(){

    /*
     * This implementation of run is accomplished using an infinite loop
     * 
     * The run method returns when all task have become complete
     */
    while(true){

      /*
       * calls toString
       */
      System.out.println(this);

      if(loopCount < 10){

        ++loopCount;
      }
      else{

        System.out.println("\t\tThread #" + this.getName() + " is complete.");

        /*
         * Exits run, stopping the thread
         */
        return;
      }
    }
  }

  public static void main(String[] args){

    for(int i = 0; i < 10; i++){

      /*
       * Here I create ten new threads
       *  Think of them as children of thread "main"
       *    or as maybe offspring threads
       *
       * Anonymous references to the threads
       */
      new Example_01();
    }
  }
}
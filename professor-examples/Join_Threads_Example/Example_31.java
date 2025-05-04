/* 
 * Professor Darrell Payne
 * Bellevue University
 *
 * Using join()
 *
 * void join() 
 *   Waits for this thread to die.
 *
 * void join(long millis) 
 *   Waits at most millis milliseconds for this thread to die.
 *
 * void join(long millis, int nanos) 
 *   Waits at most millis milliseconds plus nanos nanoseconds for this thread to die. 
 *
 * Uses Class Joiner1 & Sleeper1
 */
public class Example_31{

  public static void main(String[] args){

    for(int i = 1; i <= 5; i++){

      /*
       * new Sleeper1 Object reference is passed to the constructor of Joiner1
       */
      new Joiner1("Joiner " + i, (new Sleeper1("Sleeper " + i, 100 + (i * 5)))).start();
    }

    System.out.println("All threads have been started.");
  }
}
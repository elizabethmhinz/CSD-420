/* 
 * Professor Darrell Payne
 * Bellevue University
 *
 * Thread running to termination
 */
public class Sleeper1 extends Thread{

  private int duration;
  private int loopCount = 1;

  private Thread myRefToThread = null;
  private static int threadNumber = 0;

  /*
   * Constructor
   */
  public Sleeper1(String name, int sleepTime){

    super(name);
    ++threadNumber;
    duration = sleepTime;
  }

  @Override
  public String toString(){

    return ("Thread " + getName() + ": Loop count " + loopCount);
  }

  @Override
  public void run(){

    try{

      sleep(duration);

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
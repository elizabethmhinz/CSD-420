/*
 * Professor Darrell Payne
 * Bellevue University
 *
 * Setting priorities of threads
 *
 * Extending the Thread class
 *
 */
public class Example_04 extends Thread{

  private static int threadNumber = 0;
  private int loopCount = 1;

  final static String [] PriorityName = {"MIN_PRIORITY", "NORM_PRIORITY", "MAX_PRIORITY"};

  public Example_04(){

    super("" + ++threadNumber);

    /*
     * To be safe, you should always us the Priority Constants
     *
     * Not all systems map directly to the "10" Java Priority levels
     */
    switch((int)(Math.random() * 3)){

      case 0:
        this.setPriority(MIN_PRIORITY); // MIN_PRIORITY = 1
        break;

      case 1:
        this.setPriority(NORM_PRIORITY); // NORM_PRIORITY = 5
        break;

      case 2:
        this.setPriority(MAX_PRIORITY); // MAX_PRIORITY = 10
        break;
    }
  }

  @Override
  public String toString(){

    return ("Thread #" + this.getName() + " Priority = " + this.getPriority() + ": Loop count " + loopCount);
  }

  @Override
  public void run(){

    int priorityLevel = -1;

    while(true){

      System.out.println(this);

      if(loopCount < 10){
      // if(loopCount < 1000){

        ++loopCount;
      }
      else{

        switch(this.getPriority()){

          case 1:
            priorityLevel = 0;
            break;

          case 5:
            priorityLevel = 1;
            break;

          case 10:
            priorityLevel = 2;
            break;

        }

        System.out.println("\t\tThread #" + this.getName() + " Priority (name) = " + Example_04.PriorityName[priorityLevel] + " is complete.");
        System.out.println("\t\tThread #" + this.getName() + " Priority (number) = " + this.getPriority() + " is complete.");

        return;
      }

      try{

        sleep(10);
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

    for(int i = 0; i < 20; i++){

      new Example_04().start();
    }
  }
}
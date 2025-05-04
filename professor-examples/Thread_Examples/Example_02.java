/*
 * Professor Darrell Payne
 * Bellevue University
 *
 * yield()
 *
 */
public class Example_02 extends Thread{

  private static int threadNumber = 0;
  private int loopCount = 1;

  public Example_02(){

    super("" + ++threadNumber);
  }

  @Override
  public String toString(){

    return ("Thread #" + this.getName() + ": Loop count " + loopCount);
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
       * There is no guarantee with yield()
       *
       * yield() is a suggestion to the JVM
       *
       *  The yield() method is basically saying this thread is not doing anything particularly important
       *
       */
      yield();
    }
  }

  public static void main(String[] args){

    for(int i = 0; i < 10; i++){

      new Example_02().start();
    }
  }
}
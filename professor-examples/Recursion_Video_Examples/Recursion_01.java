/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Recursion - Use recursive methods
 *
 * Usually enables you to write a simple solution to a more difficult problem
 *
 * In the recursion process you will use something like an if-else of switch statement
 *   to control execution
 *
 * Loops control execution by controlling loop execution
 * Recursion controls execution by method invoking
 *
 * Recursion has over head, may take longer to execute that a loop format
 *
 * Recursion process may also take more memory
 *
 * Problems solved with recursion can also be solved without recursion
 *   However this may be more difficult to write and maintain
 *
 * Lastly "Tail recursion" executes with no executing statements after a method return
 * This example is not "Tail recursion"
 *
 * Recursion may be performed with multiple methods in their invoking process
 *
 */
public class Recursion_01{

  public static void main(String [] args){

    printParam(1);
  }

  public static void printParam(int i){

    System.out.println("i = " + i);

    if(i < 10){

      printParam(i + 1);
    }

    System.out.println("i = " + i);
  }
}
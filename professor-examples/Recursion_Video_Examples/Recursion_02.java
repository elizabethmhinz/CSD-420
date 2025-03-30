/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Recursion_02{

  public static void main(String [] args){

    printParam(1, "");
  }

  public static void printParam(int i, String indent){

    System.out.println(indent + "i = " + i);

    if(i < 10){

      printParam(i + 1, indent + " ");
    }

    System.out.println(indent + "i = " + i);
  }
}
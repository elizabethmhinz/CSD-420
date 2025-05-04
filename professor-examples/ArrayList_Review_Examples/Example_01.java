/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * ArrayList Review
 *
 * An ArrayList can store an unlimited number of objects
 * An ArrayList is a generic class with a generic type E
 * ArrayList<String> list = new ArrayList<String>();
 * Then you specify a concrete type to replace the E
 *
 * import java.util.*;
 * ArrayList<String> list = new ArrayList<String>();
 * or
 * java.util.ArrayList<String> list = new java.util.ArrayList<String>();
 */

public class Example_01{

  public static void main(String [] args){

  java.util.ArrayList<String> list = new java.util.ArrayList<String>();

  // add() add item (String) to list
  list.add("Cardinals");
  list.add("Cubs");
  list.add("Tigers");

  // Display items in the list invoking the toString() method
  System.out.println(list);
  System.out.println();
  System.out.println(list.toString());
  System.out.println();
  // Prints list size (number of items in list)
  System.out.println(list.size());
  System.out.println();

  list.remove(0);

  System.out.println(list.toString());
  System.out.println();
  System.out.println(list.size());

  // This is an easy way to throw an exception, be careful
  list.remove(1);

  System.out.println(list.toString());
  System.out.println();
  System.out.println(list.size());
  }
}
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

public class Example_02{

  public static void main(String [] args){

  java.util.ArrayList<String> list = new java.util.ArrayList<String>();

  System.out.println("Is the list is empty: " + list.isEmpty());
  System.out.println("The list size is: " + list.size());
  list.add("Cardinals");
  list.add("Cubs");
  list.add("Tigers");
  list.add("Rangers");
  list.add("Mets");
  System.out.println("Is the list is empty: " + list.isEmpty());
  System.out.println("The list size is: " + list.size());

  System.out.println();

  System.out.println(list);
  list.remove("Cubs");
  System.out.println(list);

  // If not there, no action
  list.remove("Cubs");
  System.out.println(list);

  System.out.println();

  System.out.println("IndexOf Mets is : " + list.indexOf("Mets"));
  list.remove("Tigers");
  System.out.println("IndexOf Mets is : " + list.indexOf("Mets"));

  System.out.println();

  String valueReceived = list.get(0);
  System.out.println(valueReceived);

  System.out.println();
  }
}
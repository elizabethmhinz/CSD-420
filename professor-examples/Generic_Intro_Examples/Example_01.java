import java.util.*;
/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * ArrayList is an example of a generic class
 *
 * Generics allow you to parameterize data types
 *   With this you can define a class or method the compiler will replace
 *   with concrete types
 * Example: You can create an ArrayList for holding data types such as:
 *   Strings, Doubles, Integers, Dates, etc.
 * Any errors in the code you use to do this will have the errors detected by the compiler
 *
 * In this module we will look at generic classes, interfaces, and methods
 *
 * The primary reason for using Generics is detecting errors at compile runtime and not runtime
 *
 * Using generics you will use something like <E> or <T> to represent a formal generic type which 
 *   will be replaces by the compiler concrete type
 * Referred to generic instantiation
 *
 * Think of this module as combining Comparable, Abstract Classes and methods, and Interfaces  
 */
public class Example_01{

  public static void main(String [] args){

    // Old way to declare an ArrayList
    //   without using generics
    ArrayList oldList = new ArrayList();

    // Generic Declaration
    ArrayList<String> list = new ArrayList<>();

    list.add("One");
    list.add("Two");
    list.add("Three");

    System.out.println(list.toString());
  }
}
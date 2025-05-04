/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_04{

  public static void main(String [] args){

  java.util.ArrayList<String> list = new java.util.ArrayList<String>();

  list.add("Cardinals");
  list.add("Cubs");
  list.add("Tigers");
  list.add("Rangers");
  list.add("Mets");
  list.add("Astors");
  list.add("Giants");

  System.out.println(list);
  // The list will hold the sorted order
  java.util.Collections.sort(list);
  System.out.println(list);

  // Replaces item on list
  System.out.println();
  java.util.Collections.sort(list);
  System.out.println(list);
  System.out.println();
  list.set(0, "Dodgers");
  System.out.println();
  java.util.Collections.sort(list);
  System.out.println(list);
  System.out.println();
  list.set(1, "Braves");
  System.out.println();
  java.util.Collections.sort(list);
  System.out.println(list);
  System.out.println();
  list.set(2, "Nationals");
  System.out.println();
  java.util.Collections.sort(list);
  System.out.println(list);
  System.out.println();
  list.set(3, "Twins");
  System.out.println();
  java.util.Collections.sort(list);
  System.out.println(list);
  System.out.println();
  System.out.println();
  }
}
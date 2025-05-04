/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Example_03{

  public static void main(String [] args){

  java.util.ArrayList<String> list = new java.util.ArrayList<String>();

  list.add("Cardinals");
  list.add("Cubs");
  list.add("Tigers");
  list.add("Rangers");
  list.add("Mets");

  // Replaces item on list
  System.out.println();
  System.out.println(list);
  System.out.println();
  list.set(0, "Dodgers");
  System.out.println();
  System.out.println(list);
  System.out.println();
  list.set(1, "Braves");
  System.out.println();
  System.out.println(list);
  System.out.println();
  list.set(2, "Nationals");
  System.out.println();
  System.out.println(list);
  System.out.println();
  list.set(3, "Twins");
  System.out.println();
  System.out.println(list);
  System.out.println();
  System.out.println();
  }
}
/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * ArrayList Vs LinkedList
 *
 * Manipulating (adding removing) an ArrayList is slower, LinkedList is quicker
 * Searching ArrayList is faster, LinkedList is slower
 *
 *  LinkedList - Quicker loading, slower searching
 *  ArrayList - Quicker searching, slower loading
 */
public class Example_15{

  public static void main(String [] args){

    java.util.ArrayList<String> baseballTeams_Array = new java.util.ArrayList<>();
    java.util.LinkedList<String> baseballTeams_Linked = new java.util.LinkedList<>();
    
    baseballTeams_Array.add("Red Sox");
    baseballTeams_Array.add("Pirates");
    baseballTeams_Array.add("White Sox");
    baseballTeams_Array.add("Cubs");
    baseballTeams_Array.add("Tigers");

    baseballTeams_Linked.add("Giants");
    baseballTeams_Linked.add("Phillies");
    baseballTeams_Linked.add("Reds");
    baseballTeams_Linked.add("Yankees");
    baseballTeams_Linked.add("Cardinals");

    System.out.println(baseballTeams_Array);
    System.out.println(baseballTeams_Linked);
  }
}
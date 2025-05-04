/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * In this module we will focus on the
 *   Java's provided types of Collections
 *     Lists, Vectors, Stacks, Queues, PriorityQueues, Sets, and Maps
 *
 * In the next module we will focus on Sets and Maps
 *
 * List - Stores ordered collection of elements
 *   Stacks - Elements - last-in first-out
 *   Queues - Elements - first in - first out
 *     PriorityQueues - Elements that are processed in order of priority
 *
 * Sets store non-duplicated elements
 *
 * Maps is a container class that stores a collection of
 *  key/value pairs 
 */
public class Example_11{

  public static void main(String [] args){

    java.util.ArrayList<String> baseballTeams = new java.util.ArrayList<>();
    
    baseballTeams.add("Red Sox");
    baseballTeams.add("Pirates");
    baseballTeams.add("White Sox");
    baseballTeams.add("Cubs");
    baseballTeams.add("Tigers");
    baseballTeams.add("Athletics");
    baseballTeams.add("Giants");
    baseballTeams.add("Phillies");
    baseballTeams.add("Reds");
    baseballTeams.add("Yankees");
    baseballTeams.add("Cardinals");
    baseballTeams.add("Senators");
    baseballTeams.add("Nationals");
    baseballTeams.add("Browns");
    baseballTeams.add("Dodgers");
    baseballTeams.add("Indians");
    baseballTeams.add("Braves");
    baseballTeams.add("Twins");
    baseballTeams.add("Orioles");
    baseballTeams.add("Mets");
    baseballTeams.add("Twins");
    baseballTeams.add("Padres");
    baseballTeams.add("Royals");
    baseballTeams.add("Blue Jays");
    baseballTeams.add("Diamondbacks");

    System.out.println("The list of teams[]: " + baseballTeams);

    System.out.println("Are the Cardinals in the list? " + baseballTeams.contains("Cardinals"));
    System.out.println("Are the Zig-Zag in the list? " + baseballTeams.contains("Zig-Zag"));
    System.out.println("Are the Pirates in the list? " + baseballTeams.contains("Pirates"));
    System.out.println("Are the Greens in the list? " + baseballTeams.contains("Greens"));

    System.out.println();

    System.out.println(baseballTeams.size());

    System.out.println();
  }
}
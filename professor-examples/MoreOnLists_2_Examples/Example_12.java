/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Cloning an ArrayList
 */
public class Example_12{

  public static void main(String [] args){

    java.util.ArrayList<String> baseballTeams_1 = new java.util.ArrayList<>();
    java.util.ArrayList<String> baseballTeams_2 = new java.util.ArrayList<>();
    
    baseballTeams_1.add("Red Sox");
    baseballTeams_1.add("Pirates");
    baseballTeams_1.add("White Sox");
    baseballTeams_1.add("Cubs");
    baseballTeams_1.add("Tigers");
    baseballTeams_1.add("Athletics");
    baseballTeams_1.add("Giants");
    baseballTeams_1.add("Phillies");
    baseballTeams_1.add("Reds");
    baseballTeams_1.add("Yankees");
    baseballTeams_1.add("Cardinals");
    baseballTeams_1.add("Senators");
    baseballTeams_1.add("Nationals");
    baseballTeams_1.add("Browns");
    baseballTeams_1.add("Dodgers");
    baseballTeams_1.add("Indians");
    baseballTeams_1.add("Braves");
    baseballTeams_1.add("Twins");
    baseballTeams_1.add("Orioles");
    baseballTeams_1.add("Mets");
    baseballTeams_1.add("Twins");
    baseballTeams_1.add("Padres");
    baseballTeams_1.add("Royals");
    baseballTeams_1.add("Blue Jays");
    baseballTeams_1.add("Diamondbacks");

    // Prints baseballTeams_2 collection (ArrayList) - Empty
    System.out.println("The list of teams baseballTeams_2 Line 41: " + baseballTeams_2);

    System.out.println();

    //  Cloning baseballTeams_2 with baseballTeams_1
    baseballTeams_2.addAll(baseballTeams_1);

    // Prints baseballTeams_2 collection (ArrayList) - after cloning
    System.out.println("The list of teams baseballTeams_2 Line 48 " + baseballTeams_2);

    System.out.println();

    // Removing all of baseballTeams_1 from baseballTeams_2
    baseballTeams_2.removeAll(baseballTeams_1);

    // Prints baseballTeams_2 collection (ArrayList) - after removal
    System.out.println("The list of teams baseballTeams_2 Line 55: " + baseballTeams_2);

    System.out.println();
  }
}
/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Looping through using forEach
 */
public class Example_14{

  public static void main(String [] args){

    java.util.ArrayList<String> baseballTeams_1 = new java.util.ArrayList<>();
    
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

    // Different lines
    baseballTeams_1.forEach(e -> System.out.println(e.toUpperCase()));

    // Same lines
    baseballTeams_1.forEach(e -> System.out.print(e.toUpperCase() + ", "));

    System.out.println();
  }
}
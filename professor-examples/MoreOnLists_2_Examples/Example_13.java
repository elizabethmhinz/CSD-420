/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Collection Iterator example
 *
 * Iterate through using a while loop
 *   with the Iterator class
 */
public class Example_13{

  public static void main(String [] args){

    java.util.Collection<String> baseballTeams_1 = new java.util.ArrayList<>();
    // Create here causes an error
    // java.util.Iterator<String> iterator = baseballTeams_1.iterator();
    java.util.Iterator<String> iterator;
    
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

    // Note, this must be created after the collection is filled
    iterator = baseballTeams_1.iterator();

    while(iterator.hasNext()){

      // Different lines
      System.out.println(iterator.next().toUpperCase());
      // or
      // Same lines wilt spaces
      // System.out.print(iterator.next().toUpperCase() + ", ");
    }

    System.out.println();
  }
}
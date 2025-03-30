/*
 * No imports
 *
 * The File class holds properties of a file or a path, however it does not hold methods for reading/writing a file.
 */
public class Exercise_02 {

  /* 
   * Almost all I/O methods will throw an IOException (java.io.IOException)
   * Another Exception that can be thrown is FileNotFoundException
   */
  public static void main(String[] args) throws java.io.IOException {

      /* 
       * In Java, we can create a PrintWriter instance for writing to a file
       * using something like:
       *
       * PrintWriter output = new PrintWriter("text.txt");
       * output.print("Text data");
       *
       * PrintWriter is an output class and
       * Scanner is an input class
       *
       * Scanner input = new Scanner(new File("text.txt"));
       * System.out.println(input.nextLine());
       *
       * FileOutputStream and FileOutputStream classes are for reading and writing files
       * 
       * FileOutputStream - If the class does not exist, one will be created
       *
       * In this example true will append the file
       * false will remove old contents and create a new data file
       */
    try (java.io.PrintWriter output =
            new java.io.PrintWriter(new java.io.FileOutputStream("Example_01.txt", true))) {

      for (int i = 0; i < 20; i++){

        output.println((int)(Math.random() * 100) + " ");
      }
    }
  }
}
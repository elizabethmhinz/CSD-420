/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Generic Methods
 */
public class Example_13 {

  public static void main(String[] args ) {

    Integer[] integers = {1, 2, 3, 4, 5};
    String[] strings = {"London", "Paris", "New York", "Austin"};

    Example_13.<Integer>print(integers);
    Example_13.<String>print(strings);
  }

  public static <E> void print(E[] list) {

    for (int i = 0; i < list.length; i++)

      System.out.print(list[i] + " ");
      System.out.println();
  }
}

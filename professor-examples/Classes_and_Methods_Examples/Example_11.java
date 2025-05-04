/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Example using the GenericStack class
 */
public class Example_11 {

  public static void main(String[] args ) {

     GenericStack<Integer> intStack = new GenericStack<>();

     // AutoBoxed into Integer Instances
     intStack.push(1);
     intStack.push(2);
     intStack.push(-2);

     System.out.println(intStack);

     double largestValue = max(intStack);
     System.out.println(largestValue);
  }

  // Find the maximum in a stack of numbers
  public static double max(GenericStack<Integer> stack) {

     // initialize max
     double max = stack.pop().doubleValue();

     while (!stack.isEmpty()) {

       double value = stack.pop().doubleValue();

       if (value > max)
         max = value;
     }

     return max;
  }
}

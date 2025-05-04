/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Two different GenericStack declaration
 */
public class Example_12 {

  public static void main(String[] args ) {

     GenericStack<Integer> intStack = new GenericStack<>();
     GenericStack<Double> doubleStack = new GenericStack<>();

     // AutoBoxed into Integer Instances
     intStack.push(1);
     intStack.push(2);
     intStack.push(-2);

     // AutoBoxed into Integer Instances
     doubleStack.push(-34.21);
     doubleStack.push(44.32);
     doubleStack.push(11.3);

     System.out.println(intStack);
     System.out.println(doubleStack);

     double largestValue = maxI(intStack);
     System.out.println(largestValue);
     largestValue = maxD(doubleStack);
     System.out.println(largestValue);
  }

  // Find the maximum in a stack of numbers
  public static double maxI(GenericStack<Integer> stack) {

     // initialize max
     double max = stack.pop().doubleValue();

     while (!stack.isEmpty()) {

       double value = stack.pop().doubleValue();

       if (value > max)
         max = value;
     }

     return max;
  }

  // Find the maximum in a stack of numbers
  public static double maxD(GenericStack<Double> stack) {

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

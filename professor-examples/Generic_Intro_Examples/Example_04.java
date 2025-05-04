import java.util.*;

public class Example_04{

  public static void main(String [] args){

    double d1 = 1.22;
    double d2 = 2.33;
    double d3 = 3.44;

    int i1 = 12;

    ArrayList<Double> list = new ArrayList<>();

    list.add(Double.valueOf(5.2));
    list.add(Double.valueOf(6.3));
    list.add(Double.valueOf(7.4));

    // Because of Autoboxing
    list.add(8.2);
    list.add(9.3);
    list.add(10.4);

    // Because of Autoboxing
    list.add(d1);
    list.add(d2);
    list.add(d3);

    // Error
    // list.add(2);
    // Corrected
    list.add((double)2);
    // Error
    // list.add(i1);
    // Corrected
    list.add((double)i1);

    System.out.println(list.toString());
  }
}
import java.util.*;

public class Example_03{

  public static void main(String [] args){

    int i1 = 11;
    int i2 = 12;
    int i3 = 13;
    double d1 = 21.22;

    ArrayList<Integer> list = new ArrayList<>();
    // Primitive types allowed, must be a class (reference) type
    // ArrayList<int> listError = new ArrayList<>();

    list.add(Integer.valueOf(5));
    list.add(Integer.valueOf(6));
    list.add(Integer.valueOf(7));

    // Because of Autoboxing
    list.add(8);
    list.add(9);
    list.add(10);

    // Error. list holds Integer
    // list.add("Four");

    // Because of Autoboxing
    list.add(i1);
    list.add(i2);
    list.add(i3);

    // Mismatch of data types
    // list.add(99.0);
    // list.add(Double.valueOf(5.2));
    // list.add(d1);

    System.out.println(list.toString());
  }
}
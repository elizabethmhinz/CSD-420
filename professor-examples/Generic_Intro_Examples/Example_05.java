import java.util.*;

public class Example_05{

  public static void main(String [] args){

    ArrayList<Integer> list_I = new ArrayList<>();
    ArrayList<Double> list_D = new ArrayList<>();

    list_I.add(Integer.valueOf(5));
    list_D.add(Double.valueOf(6.3));

    // Because of Autoboxing
    list_I.add(8);
    list_D.add(9.3);

    // Mismatch of data types
    // list_I.add(99.0);
    // list_D.add(99);

    // Corrected
    list_I.add((int)1.0);
    list_D.add((double)2);

    System.out.println(list_I.toString());
    System.out.println(list_D.toString());
  }
}
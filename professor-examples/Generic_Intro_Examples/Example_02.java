import java.util.*;

public class Example_02{

  public static void main(String [] args){

    ArrayList<String> list = new ArrayList<>();

    list.add("1");
    // Error 1, this list can only hold Strings
    // list.add(2);
    list.add("3");
    // Error 2, list can only hold String
    // list.add(Integer.value(7));

    System.out.println(list.toString());
  }
}
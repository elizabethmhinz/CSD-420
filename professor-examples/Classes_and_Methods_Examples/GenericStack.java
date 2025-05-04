/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * This class starts with a generice type that is defined with a concrete class
 *   when an instance is made
 * 
 *  This code is in the MyStack class from an earlier module
 *  This class was so that objects could be help in place of primnitive 
 * such as ints at compile time
 *
 *  Here is the old code:
 *
import java.util.ArrayList;

public class MyStack {

  private ArrayList<Object> list = new ArrayList<Object>();

  public boolean isEmpty() {

    return list.isEmpty();
  }

  public int getSize() {

    return list.size();
  }

  ---------- changed ---------- 
          Object to <E>
  public Object peek() {

    return list.get(getSize() - 1);
  }

  ---------- changed ---------- 
          Object to <E>
  public Object pop() {

    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  ---------- changed ---------- 
          Object to <E>
  public void push(Object o) {

    list.add(o);
  }

  @Override
  public String toString() {

    return "stack: " + list.toString();
  }
}
 *
 * The GenericStack class is designed to allow
 * genrice concrete specification at compile time, 
 * not run time
 *
 */
public class GenericStack<E> {

  private java.util.ArrayList<E> list = new java.util.ArrayList<>();

  public int getSize() {

    return list.size();
  }

  public E peek() {

    return list.get(getSize() - 1);
  }

  public void push(E o) {
    list.add(o);
  }

  public E pop() {

    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {

    return list.isEmpty();
  }
  
  @Override
  public String toString() {

	return "stack: " + list.toString();
  }
}

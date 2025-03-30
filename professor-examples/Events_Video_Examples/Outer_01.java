/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
public class Outer_01{

  private int outerInt_01 = (int)(Math.random() * 100 + 1);

  public class Inner_01{

    public void innerMethod(){

      System.out.println("Outer1.this.outerInt_01 = " + Outer_01.this.outerInt_01);
    }
  }

  public static void main(String [] args){

    // Option 1
    Outer_01 out_01 = new Outer_01();
    Inner_01 in_01 = out_01.new Inner_01();
    in_01.innerMethod();

    // Option 2
    Inner_01 in_02 = new Outer_01().new Inner_01();
    in_02.innerMethod();
  }
}
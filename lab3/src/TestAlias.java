public class TestAlias {
  public static void main(String[] args) {

    Fraction2 f1, f2, f3;
//////////////////////
    f1 = new Fraction2(2, 3);
    f2 = new Fraction2(1, 3);
    f3 = new Fraction2(5, 6);
    f1.square();
    f3=f2.copy();
    f2=f1.copy();
    /****************************
    put in appropriate  statements to produce the following result:
    Case 1: f1 = 4/9; f2 = 4/9; f3 = 1/3
    ****************************/
    System.out.println("Case 1: f1 = " + f1 + "; f2 = " + f2 + "; f3 = " + f3);

//////////////////////
    f1 = new Fraction2(2, 3);
    f2 = new Fraction2(1, 3);
    f3 = new Fraction2(5, 6);
    f1.square();
    f3=f2.copy();
    f2.square();

    /****************************
    put in appropriate statements to produce the following result:
    Case 2: f1 = 4/9; f2 = 1/9; f3 = 1/3
    ****************************/

    System.out.println("Case 2: f1 = " + f1 + "; f2 = " + f2 + "; f3 = " + f3);

//////////////////////
    f1 = new Fraction2(2, 3);
    f2 = new Fraction2(1, 3);
    f3 = new Fraction2(5, 6);
    f2=f1.copy();
    f2.inverse();
    f3=f2.copy();
    f3.square();
    /****************************
    put in appropriate statements to produce the following result:
    Case 3: f1 = 2/3; f2 = 3/2; f3 = 9/4
    ****************************/

    System.out.println("Case 3: f1 = " + f1 + "; f2 = " + f2 + "; f3 = " + f3);

  }
}

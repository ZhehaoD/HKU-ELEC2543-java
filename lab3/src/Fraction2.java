public class Fraction2{

    // method for finding the greatest common divisor of the parameters
    // e.g. gcd(15, 10) returns 5
    // You are recommended to pass positive parameters to this method
    // we will explain what "private" and "static" mean in later classes
    // you do not have to use this method if you do not want to
    private int numerator;
    private int denominator;
    public Fraction2(int a, int b){
        if(a==0){
            numerator=0;
            denominator=1;
        }
        if(b==0 && a!=0){
            numerator=1;
            denominator=2;
        }
        if((a<0 && b<0)||(a>0 && b<0)){
            numerator=-a;
            denominator=-b;
        }
        if((a<0 && b>0)||(a>0 && b>0)){
            numerator=a;
            denominator=b;
        }
        if(gcd(numerator,denominator)!=1){
            a=gcd(numerator,denominator);
            numerator=numerator/a;
            denominator=denominator/a;
        }
    }


    private static int gcd(int a, int b) {
        if(a == 0 || b == 0) return a+b; // base case
        return gcd(b,a%b);
    }

    public double value(){
        return numerator/(double)denominator;
    }

    public String toString(){
        String nu=Integer.toString(numerator);
        String de=Integer.toString(denominator);
        return nu+"/"+de;
    }
    public void square(){
        numerator=numerator*numerator;
        denominator=denominator*denominator;
    }
    public Fraction2 copy(){
        return new Fraction2(this.numerator,this.denominator);
    }

    public Fraction2 inverse(){
        int temp=numerator;
        numerator=denominator;
        denominator=temp;
        return this;
    }
}

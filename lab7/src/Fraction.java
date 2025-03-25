public class Fraction implements Comparable<Fraction>, Addable {
  private int numerator, denominator;

  public Fraction(int num, int denom) {
    numerator = num;
    denominator = denom;
  }

  public double value() {
    return (double) numerator / denominator;
  }

  public String toString() {
    return Integer.toString(numerator) + "/" + Integer.toString(denominator);
  }

  public int compareTo(Fraction other) {
    double thisValue = this.value();
    double otherValue = other.value();
    if (thisValue < otherValue) {
      return -1;
    } else if (thisValue > otherValue) {
      return 1;
    }
    return 0;
  }

  public Addable add(Addable obj) {
    Fraction other = (Fraction) obj;
    int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
    int newDenominator = this.denominator * other.denominator;
    return new Fraction(newNumerator, newDenominator);
  }
}
// a class for representing dates
public class MyDate {
  private int year, month, day;

  // constructor
  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() { return year; }

  public int getMonth() { return month; }

  public int getDay() { return day; }

  // print out date in the form of DD/MM/YYYY
  // no preceding zero for DD and MM

  public String toString() {
    return day + "/" + month + "/" + year;
  }
  public int compareTo(MyDate other) {
    if (this.year != other.year) {
      return this.year - other.year;
    }
    if (this.month != other.month) {
      return this.month - other.month;
    }
    return this.day - other.day;
  }
}

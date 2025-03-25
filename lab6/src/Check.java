public class Check {
    private String Payee;
    private static int Check_Number=1001;
    private int CheckNum;
    private int amount;
    private MyDate date;
    public Check(String name, int amt, MyDate date){
        Payee=name;
        amount=amt;
        this.date=date;
        CheckNum=Check_Number;
        Check_Number+=1;
    }

    public static int getCheck_Number() {
        return Check_Number;
    }

    public int getAmount() {
        return amount;
    }

    public MyDate getDate() {
        return date;
    }

    public String toString() {
        return "Check No: "+CheckNum+", Payee: "+Payee+", Amount: "+amount+", Date: "+date;
    }
}

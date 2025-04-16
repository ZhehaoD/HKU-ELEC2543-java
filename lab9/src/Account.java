import java.util.ArrayList;

public class Account {

  private int balance;

  public Account(int initialBalance) {
    balance = initialBalance;
  }

  public void processCheck(Check check) throws NotEnoughFundException {
    if (balance< check.getAmount()){
      throw new NotEnoughFundException();
    }
    balance-= check.getAmount();
  }

  public void processTransaction(ArrayList<Check> checks) {
    for(Check check : checks){
      boolean checked=false;
      while(!checked){
        try {
          System.out.println("The current balance is " + balance);
          System.out.println("");
          System.out.println("Processing "+check.toString());
          processCheck(check);
          checked = true;
        }catch(NotEnoughFundException exception) {
          System.out.println("check cannot be cleared due to not enough fund.");
          balance += 500;
          System.out.println("add 500 to the account...");
        }
        }
      }
    System.out.println("The current balance is " + balance);

    }
}

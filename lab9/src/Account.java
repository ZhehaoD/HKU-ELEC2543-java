import java.util.ArrayList;

public class Account {

  private int balance;

  public Account(int initialBalance) {
    balance = initialBalance;
  }

  public void processCheck(Check check) throws NotEnoughFundException {
  }

  public void processTransaction(ArrayList<Check> checks) {
  }
}

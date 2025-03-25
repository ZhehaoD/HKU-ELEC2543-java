import java.util.ArrayList;
import java.util.Random;

public class empl extends user{
    public empl(String Name, int money) {
        super(Name, money);
    }
    public void receive(ArrayList<Integer> list){
        int index= new Random().nextInt(list.size());
        int mo=list.remove(index);
        int money=getMoney();
        setMoney(money+mo);
    }
}

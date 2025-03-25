import java.util.ArrayList;

public class boss extends user{
    public boss(String Name, int money) {
        super(Name, money);
    }
    public ArrayList<Integer> send(int totalmoney, int amount){
        ArrayList<Integer> list =new ArrayList<>();
        int leftmoney=getMoney();
        if(totalmoney>leftmoney){
            System.out.println("钱不够");
            return list;
        }
        super.setMoney(leftmoney-totalmoney);
        int avg = totalmoney/amount;
        int res = totalmoney%amount;
        for(int i=0;i<amount-1;i++){
            list.add(avg);
        }
        list.add(avg+res);
        return list;
    }
}

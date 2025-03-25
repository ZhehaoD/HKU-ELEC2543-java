import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boss boss = new boss("haha",100);
        empl r1 = new empl("r1",20);
        empl r2 = new empl("r2",40);
        boss.show();
        r1.show();
        r2.show();
        ArrayList<Integer> money= boss.send(49 ,2);
        r1.receive(money);
        r2.receive(money);
        boss.show();
        r1.show();
        r2.show();
    }
}
public class user {
    private String Name;
    private int money;
    public user(String Name, int money){
        this.Name=Name;
        this.money=money;
    }
    public void show(){
        System.out.println(Name + "ss" +money);
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

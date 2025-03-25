import java.util.*;
public class CheckSummary {
    public static void printSummary(ArrayList<Check> checks) {
        for (Check check : checks) {
            System.out.println(check);
        }
        System.out.println("The next check number is " + Check.getCheck_Number());
        System.out.println("");
        int[][] total = new int[100][12];
        int sum=0;
        for(int x=0;x<100;x++) {
            for (int y = 0; y < 12; y++) {
                total[x][y] = 0;
            }
        }
        for(Check check : checks){
            int year=check.getDate().getYear()-2000;
            int month=check.getDate().getMonth()-1;
            total[year][month]+=check.getAmount();
            sum+=check.getAmount();
        }
            for(int x=0;x<100;x++){
                for(int y=0;y<12;y++){
                    if(total[x][y]!=0) {
                        System.out.println("The total amount of the checks issued in " + (x + 2000) + "/" + (y + 1) + " is " + total[x][y]);
                    }
                }
            }
            System.out.println("The total amount is "+sum);
    }
}

import java.util.Scanner;   // import Scanner class to read inputs

// "public" is a visibility modifier
// we will study more about visibility modifiers later
public class test {

    // "private" is a visibility modifier
    // we will study more about visibility modifiers later
    // this method is "static" means this method belong to the class instead of an individual object
    // we will study the meaning of "static" in details later
    // This method prints out the menu to ask for user input
    private static void printMenu() {
        System.out.println("This program prints a shape with a certain size of your choice.");
        System.out.println("You have to select the shape from one of the following:");
        System.out.println("0 -- right-angled triangle with the right angle in the lower left");
        System.out.println("1 -- right-angled triangle with the right angle in the upper left");
        System.out.println("2 -- right-angled triangle with the right angle in the lower right");
        System.out.println("3 -- a diamond");

        System.out.println("After selecting the shape, you will be asked to input the size of the shape. For triangles, the size is the width and height of the triangle. This size must not be larger than 15. For diamonds, the size tells the number of * on the longest row. The size must be an odd number not larger than 15.\n");
    }


    // This method prints out the right-angled triangle
    // with the right angle in the lower left
    private static void printLLT(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void printULT(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void printLRT(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size-3; j >= i-1 ; j--)
                System.out.print(" ");
            for (int k = 0; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void printDMD(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size-3; j >= i-1 ; j--)
                System.out.print(" ");
            for (int k = -1; k <= i+i-1; k=k+1){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j <= i ; j++)
                System.out.print(" ");
            for (int k = size+size-4; k >= i+i; k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    // main method is the starting point of a program
    // "String[] args" carries the arguments passed to the method
    // We will study them in details later
    public static void main(String[] args) {
        int choice, size, var1, var2;
        Scanner scan = new Scanner(System.in);
        printMenu();

        System.out.print("Enter the choice of your shape:");
        var1 = scan.nextInt();
        for (; var1<0 || var1>3;){
            System.out.print("Enter the choice of your shape:");
            var1 = scan.nextInt();
        }

        System.out.print("Enter the size of your shape:");
        var2 = scan.nextInt();
        if (var1 == 3){
            for (; var2%2 == 0;){
                System.out.print("Enter the size of your shape:");
                var2 = scan.nextInt();
            }
        }
        for (; var2 > 15 || var2<= 0;){
            System.out.print("Enter the size of your shape:");
            var2 = scan.nextInt();
            if (var1 == 3){
                for (; var2%2 == 0;){
                    System.out.print("Enter the size of your shape:");
                    var2 = scan.nextInt();
                }
            }
        }

        choice = var1;
        size = var2;


        switch (choice) {
            case 0: printLLT(size); break;
            case 1: printULT(size); break;
            case 2: printLRT(size); break;
            case 3: printDMD(size/2+1); break;
        }
    }
}

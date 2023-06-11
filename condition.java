import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check Adult Or Not Adult-----------------
        /*
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }*/
        //-------------------------------------------

        // Check Even or Odd Number -----------------
        /* 
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }*/
        //---------------------------------------------

        // Check Two Number Equal Or Not Equal Or Which Number is greater or lesser--
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Equal");
        } else if (a > b) {
             System.out.println("a is greater.");
            }
            else {
                System.out.println("a is a lesser");
            }
        //----------------------------------------------------------------------------
    }
}

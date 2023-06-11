import java.util.Scanner;

public class loops {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // For loop -----------------------------------------
        for (int i = 0; i < num; i++) {
            System.out.println(i + " Hello World");
        }
        // ---------------------------------------------------

        // While Loop ----------------------------------------
        /*int i = 0;
        while (i < num) {
            System.out.println(i + " Hello World");
            i++;
        }*/
        //----------------------------------------------------

        // Do While Loop -------------------------------------

        /*int i = 0;
        do{
            System.out.println(i + " Hello World");
            i++;
        } while (i < num);*/
        //------------------------------------------------------
    }
}

public class format_Specifer {
    public static void main(String[] args) {
        boolean b = true;
        char c = 's';
        short s = 12458;
        int i = 2569874;
        float f = 10.25f;
        double d = 10.2;

        System.out.printf("boolean b = %b\n", b);
        System.out.printf("char c = %c\n", c);
        System.out.printf("short s = %d\n", s);
        System.out.printf("int i = %d\n", i);
        System.out.printf("int f = %.2f\n", f);
        System.out.printf("int d = %.2f\n", d);
    } 
}
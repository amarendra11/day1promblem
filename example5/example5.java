package example5;

public class example5 {
    static int a = 3;
    static int b;

    static void main(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("statick block initilised.");
        b = a * 4;
    }

    public static void main(String[] args) {

    }
}

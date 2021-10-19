package chapter13.ex26;

public class Main {
    static int num;

    private static void test() {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        Main.test();
        Main.test();
        System.out.println(Main.num + 1);
    }
}

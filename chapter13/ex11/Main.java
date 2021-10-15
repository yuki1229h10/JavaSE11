package chapter13.ex11;

public class Main {
    private static int num;
    {
        num = 10;
    }
    {
        num = 20;
    }

    static void test(int num) {
        num = num * num;
    }

    public static void main(String[] args) {
        test(num);
        System.out.println(num);
    }
}

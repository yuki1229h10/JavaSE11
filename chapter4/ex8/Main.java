package chapter4.ex8;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++, period()) {
            System.out.println(i);
        }
    }

    private static void period() {
        System.out.print(",");
    }
}
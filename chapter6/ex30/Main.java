package chapter6.ex30;

public class Main {
    public static void main(String[] args) {
        Sample s = new Sample(10);
        modify(s);
        System.out.println(s.num);
    }

    private static void modify(Sample s) {
        s.num *= 2;
    }
}

package chapter6.twentynine;

public class Main {
    public static void main(String[] args) {
        Sample s = new Sample(10);
        modify(s.num);
        System.out.println(s.num);
        int scores[][] = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };
        System.out.println("\n" + scores[1][2]);

        String str = "ABCDE";
        String str2 = str.replace("CD", "34");
        System.out.println(str2);
    }

    private static void modify(int num) {
        num *= 2;
        System.out.println(num);
    }

}

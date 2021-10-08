package chapter12.ex58;

public class Main {
    public static void main(String[] args) {
        int num = 9;
        if (num++ < 10) {
            System.out.println(num);
        } else {
            System.out.println("B");
        }
    }
}

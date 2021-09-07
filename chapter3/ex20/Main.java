package chapter3.ex20;

public class Main {
    public static void main(String[] args) {
        final int NUM = 10;
        int num = 10;
        switch (num) {
            case 10:
                System.out.println("A");
                break;
            case 20:
                System.out.println("B");
                break;
        }
    }
}

// 変数はcase値として使用できない。
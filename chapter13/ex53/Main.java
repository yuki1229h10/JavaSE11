package chapter13.ex53;

public class Main {
    private String val;
    private int num;

    public Main(int num) {
        this.val = "I love Yokohama";
        this.num = num;
    }

    public Main() {
        this.val = "test";
        this.num = 10;
    }

    public static void main(String[] args) {
        Main m = new Main(30);
        System.out.println(m.val + "," + m.num);
    }
}

package test.overload;

public class Main {

    public static void main(String[] args) {

        Calculation cal = new Calculation();
        System.out.println("引数2つ（int型）のメソッド：" + cal.add(2, 2));
        System.out.println("引数2つ（int型）のメソッド：" + cal.add(2, 2));
        System.out.println("引数2つ（int型）のメソッド：" + cal.add(2, 2));
    }

}

package chapter3.eleven;

public class Main {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = null;
        System.out.println(a.equals(b));
    }
}

// null以外の参照値xについて、x.equals(null)はfalseを返すこと
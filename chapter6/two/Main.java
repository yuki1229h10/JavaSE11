package chapter6.two;

public class Main {
    public static void main(String[] args) {
        Item a = new Item();
        Item b = new Item();
        a.name = "apple";
        b.price = 100;
        a.price = 200;
        b.name = "banana";
        b = a;
        b.printInfo();
    }
}

// b = a;なら、後置の変数に格納された値が返ってくる。
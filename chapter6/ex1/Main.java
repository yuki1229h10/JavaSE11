package chapter6.ex1;

public class Main {
    public static void main(String[] args) {
        Item a = new Item();
        Item b = new Item();
        a.getNum();
        b.setNum(20);
        System.out.println(a.getNum());
        System.out.println(b.getNum());
    }
}

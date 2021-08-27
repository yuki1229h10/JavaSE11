package chapter7.nineteen;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "sample";
        child.callName();
        System.out.println("\n" + child.getName());
    }
}
package chapter12.ex35;

public class B extends A {
    public void print() {
        System.out.println("B");
    }

    public void b() {
        print();
    }

    public static void main(String[] args) {
        B b = new B();
        b.a();
        b.b();
    }
}

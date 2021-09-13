package chapter7.ex4;

public interface A {
    default void sample() {
        System.out.println("sample");
    }
}
package chapter8.ex6;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> func = () -> {
            return "Hello, Lambda";
        };
        System.out.println(func.get());
    }
}

package chapter8.ex8;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> func = str -> {
            System.out.println("Hello" + str);
        };
        func.accept("Java");
    }
}

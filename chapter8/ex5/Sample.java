package chapter8.ex5;

import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        Predicate<String> p = str -> {
            return "".equals(str);
        };
        System.out.println(p.test(args[0]));
    }
}
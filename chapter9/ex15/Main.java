package chapter9.ex15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = { "B", "C" };
        String[] b = { "a", "b", "c" };
        System.out.println(Arrays.mismatch(a, b));
    }
}

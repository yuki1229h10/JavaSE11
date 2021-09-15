package chapter9.ex3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3 });
        list.sort((a, b) -> -a.compareTo(b));
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}

package chapter13.ex41;

public class Main {
    public static void main(String[] args) {
        String[] array = { "A", "B", "C", "D", "E" };
        for (String str : array) {
            if ("B".equals(str)) {
                continue;
            }
            if ("C".equals(str)) {
                break;
            }
            System.out.println(str);
        }
    }
}

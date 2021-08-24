package chapter4.fourteen;

public class Main {
    public static void main(String[] args) {
        String[] array = { "A", "B" };
        for (String a : array) {
            for (String b : array) {
                if ("B".equals(b))
                    break;
                // System.out.print(a);
                System.out.print(b);
            }
        }
    }
}

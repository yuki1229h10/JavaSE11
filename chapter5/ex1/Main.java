package chapter5.ex1;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        Class clazz = array.getClass();
        System.out.println(clazz.getCanonicalName());
    }
}

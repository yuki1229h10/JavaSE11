package chapter4.thirteen;

public class Main {
    public static void main(String[] args) {
        // int num = 10;
        // while(++num < 10){
        // num++;
        // }
        // System.out.println(num);

        int num = 0;
        while (true) {
            num++;
            if (num == 11) {
                break;
            }
            System.out.println(num);
        }
    }
}

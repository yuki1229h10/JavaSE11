package chapter2.ex16;

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = str.replace("a", "b");
        System.out.println(str);
        System.out.println(str2);

        String str3 = "abcde";
        String str4 = str3.substring(1, 3).replace("b", "c");
        System.out.println(str3);
        System.out.println(str4);

        String str5 = "abcde";
        String str6 = str5.substring(1, 3);
        String str7 = str6.replace("b", "c");
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
    }
}

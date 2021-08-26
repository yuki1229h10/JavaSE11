package chapter6.twelve;

public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        float result = s.divide(10, 2);
        double result2 = s.divide(20, 4);
        System.out.println(result);
        System.out.println(result2);
    }
}

// 呼び出し先のreturnの型は浮遊小数点のfloatである為、それに適合する型を呼び出し元でも宣言する必要がある。
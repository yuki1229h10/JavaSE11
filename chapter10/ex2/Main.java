package chapter10.ex2;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("A");
            }
        } catch (NullPointerException e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }
}

// 複数のcatchブロックがある場合、到達可能なコードでなければ、コンパイルエラーになる。
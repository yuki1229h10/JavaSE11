package chapter2.ex22;

public class Sample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb.indexOf("cd"));
    }
}

// indexOfメソッドは、StringBuilderのインスタンスが保持している文字列のうち、引数で受け取った文字列の開始位置を戻す。
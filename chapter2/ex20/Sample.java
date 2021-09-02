package chapter2.ex20;

public class Sample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        sb.append("123456789");
        System.out.println(sb.capacity());

        sb.append("123456789");
        System.out.println(sb.capacity());

        sb.append("123456789");
        System.out.println(sb.capacity());

        sb.append("123456789");
        System.out.println(sb.capacity());

    }
}

// デフォルトでは16です。
// 文字列を追加すると自動的に容量も追加されます。
// StringBufferクラスも同様にバッファ容量を確認できます。
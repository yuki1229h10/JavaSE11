package chapter2.ex17;

public class Sample {
    public static void main(String[] args) {
        String str = "Hello,".concat("Java");
        System.out.println(str);
        ap();
    }

    public static void ap() {
        StringBuilder str = new StringBuilder("日本");
        str.append("かきくけこ");
        str.append("かぷこけこ");
        System.out.println(str.toString());
    }

}

// 引数を取るか、取らないか
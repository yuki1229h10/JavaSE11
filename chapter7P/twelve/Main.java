package chapter7P.twelve;

public class Main {
    private short s;
    private Integer i = 0;

    public Main(int i) {
        this.i = this.i + i + s;
        this.s = 0;
    }

    public void print() {
        System.out.println("s = " + s + " : i = " + i);
    }

    public static void main(String[] args) {
        Main obj = new Main(5);
        obj.print();
    }
}

// NullPointerExceptionが8行目で発動するのは、integerがnullで定義されている為。
// integerに0が入っていたら計算できる。
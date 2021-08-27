package chapter7.twentyone;

public class Main {
    public static void main(String[] args) {
        new Child("D");
    }
}

// オーバーロードされた別のコンストラクタを呼び出す時に使うのがthis
// コンストラクタ内からスーパークラスのコンストラクタを呼び出すのがsuper
// この構図ではParentからChildの順へ
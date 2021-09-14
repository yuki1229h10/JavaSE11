package chapter8.ex4;

public class Sample {
    public static void main(String[] args) {
        int cnt = 0;
        Runnable r = () -> {
            // for (cnt = 0; cnt < 10; cnt++) {
            // System.out.println(cnt++);
            // }
            System.out.println(cnt);
        };
        new Thread(r).start();
    }
}

// Local variable cnt defined in an enclosing scope must be final or effectively
// final
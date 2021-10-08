package test.override;

class ClassSuper {
    public int i1 = 3;
    public int i2 = 5;

    public void calc() {
        System.out.println(i1 + i2);
    }
}

class ClassSub extends ClassSuper {
    @Override
    public void calc() {
        System.out.println(i1 * i2);
        super.calc();
    }
}

public class Main {

    public static void main(String[] args) {
        ClassSub cs = new ClassSub();
        cs.calc();
    }
}

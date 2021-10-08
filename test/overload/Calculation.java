package test.overload;

public class Calculation {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a) {
        return a + 1;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

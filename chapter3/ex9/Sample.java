package chapter3.ex9;

public class Sample {
    private int num;
    private String name;

    public Sample(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Sample) {
            Sample s = (Sample) obj;
            return s.num == this.num;
        }
        return false;
    }
}

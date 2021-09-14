package chapter8.ex3;

public class Main {
    public static void main(String[] args) {
        String val = "A";
        // Function f = (val)-> {
        // System.out.println(val);
        // };
        System.out.println(val);
    }
}

interface Function {
    void test(String val);
}

// Lambda expression's parameter name cannot redeclare another local variable
// defined in an enclosing scope.
package test;

// import apple.laf.JRSUIConstants.State;

// class Employee {
//     int id;

//     void setId(int i) {
//         id = i;
//     }

//     int getId() {
//         return id;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Employee a = new Employee();
//         a.setId(100);
//         Employee b = new Employee();
//         b.setId(200);
//         System.out.println("Aさん:" + a.getId());
//         System.out.println("Bさん:" + b.getId());
//     }
// }

// class Test {
//     void myPrint() {
//         System.out.println("myPrint()");
//     }

//     void myPrint(String s) {
//         System.out.println("myPrint(String s)");
//     }

//     void myPrint(int a) {
//         System.out.println("myPrint(int a)");
//     }

//     void myPrint(int a, int b) {
//         System.out.println("myPrint(int a, int b)");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.myPrint();
//         t.myPrint(100);
//         t.myPrint(100, 200);
//         t.myPrint("Yokohama");
//     }
// }

class Test {
    public void method(String s, int... a) {
        System.out.println(s + "サイズ：" + a.length);
        for (int i : a) {
            System.out.println("第2引数の値:" + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        int[] ary = { 10, 20, 30 };
        obj.method("1回目");
        obj.method("2回目", 10);
        obj.method("3回目", 10, 20);
        obj.method("4回目", ary);
        obj.method("5回目", null);
    }
}
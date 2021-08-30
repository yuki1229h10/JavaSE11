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

// class Test {
//     public void method(String s, int... a) {
//         System.out.println(s + "サイズ：" + a.length);
//         for (int i : a) {
//             System.out.println("第2引数の値:" + i);
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Test obj = new Test();
//         int[] ary = { 10, 20, 30 };
//         obj.method("1回目");
//         obj.method("2回目", 10);
//         obj.method("3回目", 10, 20);
//         obj.method("4回目", ary);
//         obj.method("5回目", null);
//     }
// }

// class Employee {
//     private String id = "100";

//     public String getId() {
//         return id;
//     }
// }

// class Sales extends Employee {
//     private String clientName = "SE";

//     public String getClientName() {
//         return clientName;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Sales s = new Sales();
//         System.out.println(s.getClientName());
//         System.out.println(s.getId());
//     }
// }

// class SuperA {
//     public void print(String s) {
//         System.out.println("SuperA print : " + s);
//     }

//     public void method() {

//     }
// }

// class SubA extends SuperA {
//     public void print(String s) {
//         s = "渡された文字列は：" + s + "です";
//         System.out.println("SubA print : " + s);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         SuperA obj1 = new SuperA();
//         obj1.print("Java");
//         SubA obj2 = new SubA();
//         obj2.print("PHP");
//     }
// }

// class SuperA {
//     void methodA() {
//         System.out.println("SuperA:methodA()");
//     }

//     static void methodB() {
//         System.out.println("SuperA:methodB()");
//     }
// }

// class SubA extends SuperA {
//     void methodA() {
//         System.out.println("SubA:methodA()");
//     }

//     static void methodB() {
//         System.out.println("SubA:methodB()");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         SubA obj = new SubA();
//         obj.methodA();
//         obj.methodB();
//     }
// }

// class Foo {
//     String str;
//     int num;

//     public Foo() {
//         this("no_deta");
//     }

//     public Foo(String str) {
//         this(str, 1);
//     }

//     public Foo(String str, int num) {
//         this.str = str;
//         this.num = num;
//         System.out.println("String : " + this.str);
//         System.out.println("int : " + this.num);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Foo f1 = new Foo();
//         Foo f2 = new Foo("Hey");
//         Foo f3 = new Foo("Bye", 200);
//     }
// }

// class SuperA {
//     int num;

//     public void methodA() {
//         num += 100;
//     }

//     public void print() {
//         System.out.println("num値：" + num);
//     }
// }

// class SubA extends SuperA {
//     public void methodA() {
//         num += 500;
//     }

//     public void methodB() {
//         methodA();
//         print();
//         super.methodA();
//         print();
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         SubA obj = new SubA();
//         obj.methodB();
//     }
// }

// class SuperA {
//     public SuperA() {
//         System.out.println("SuperA()");
//     }

//     public SuperA(int a) {
//         System.out.println("SuperA(int a)");
//     }
// }

// class SubA extends SuperA {
//     public SubA() {
//         System.out.println("SubA()");
//     }

//     public SubA(int a) {
//         System.out.println("SubA(int a)");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         SubA obj1 = new SubA();
//         SubA obj2 = new SubA(10);
//     }
// }

// class SuperA {
//     public SuperA() {
//         System.out.println("SuperA()");
//     }

//     public SuperA(int a) {
//         System.out.println("SuperA(int a)");
//     }
// }

// class SubA extends SuperA {
//     public SubA() {
//         System.out.println("SubA()");
//     }

//     public SubA(int a) {
//         super(a);
//         System.out.println("SubA(int a)");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         SubA obj1 = new SubA();
//         SubA obj2 = new SubA(10);
//     }
// }

// abstract class SuperA {
//     protected abstract void methodA();

//     public void methodB() {

//     }
// }

// class SubA extends SuperA {
//     protected void methodA() {

//     }

//     public void methodA() {

//     }

//     public void methodB() {

//     }
// }


// Javaのインスタンスについて学び、インスタンスとはプログラムの設計図であるクラスを利用可能にしたオブジェクトであることを理解した。new演算子を用いてクラスに記述された処理を実行する方法を学び、その一連の動作はインスタンス化と表現されていることも理解した。
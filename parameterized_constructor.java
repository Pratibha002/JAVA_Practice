package JAVA_Practice;

class A {
    int x;
    double y;
    String z;

    A(int a, double d, String s) {
        x = a;
        y = d;
        z = s;

    }

    void show() {
        System.out.println(x + " " + y + " " + z);
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        A ref = new A(10, 10.90, "Hello");
        ref.show();

    }
}

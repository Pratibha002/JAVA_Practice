package JAVA_Practice;

public class constructorDemo {

    constructorDemo() {
        System.out.println("Hello arguement constructor"); // 2nd
    }

    constructorDemo(int a, int b) {
        this();                          // by using this() we can call another constructor in the same class
        System.out.println("Hello 2 arguement constructor");// 3rd
    }

    public static void main(String[] args) {
        System.out.println("Main Method"); // 1st
        new constructorDemo(2, 3);
        System.out.println("Main Method end");// last
    }

}

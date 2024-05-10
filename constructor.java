package JAVA_Practice;

public class constructor {

    constructor() {
        System.out.println("Hello arguement constructor");// 2nd this line execute
    }

    constructor(int a, int b) {
        // this();
        System.out.println("Hello 2 arguement constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method"); // 1st this line execute
        new constructor();
        System.out.println("Main Method end");// this line execute in the last
    }

}

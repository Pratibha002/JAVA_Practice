package JAVA_Practice;

import java.util.Scanner;

public class Demo {
    int num1, num2;

    public int add() {
        return num1 + num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("ENTER THE VALUE OF NUM1: ");
            int num1 = s.nextInt();
            System.out.println("ENTER THE VALUE OF NUM2: ");
            int num2 = s.nextInt();

            obj.num1 = num1;
            obj.num2 = num2;
        }

        int r1 = obj.add();
        int r2 = obj.sub();
        System.out.println("NUM1 + NUM2 =  " + r1);
        System.out.println("NUM1 - NUM2 = " + r2);

    }
}

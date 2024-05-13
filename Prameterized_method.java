package JAVA_Practice;

import java.util.Scanner;
public class Prameterized_method {
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public static void main(String[] args) {
        Prameterized_method p = new Prameterized_method();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("ENTER THE VALUE OF NUM1: ");
            int num1 = s.nextInt();
            System.out.println("ENTER THE VALUE OF NUM2: ");
            int num2 = s.nextInt();

            int r1=p.add(num1, num2);
            int r2=p.sub(num1, num2);

            System.out.println("NUM1 + NUM2 =  " +r1);
            System.out.println("NUM1 - NUM2 = "  +r2);
        }


    }
    
}

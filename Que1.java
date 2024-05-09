package JAVA_Practice;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("even number = " + i);
            }
        }
        sc.close();
    }
}

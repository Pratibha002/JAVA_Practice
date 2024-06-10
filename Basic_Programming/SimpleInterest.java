//Java Program to Calculate Simple Interest
package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE Principal : ");
        double P = sc.nextDouble();
        System.out.println("ENTER THE Rate : ");
        double R = sc.nextDouble();
        System.out.println("ENTER THE Time : ");
        double T = sc.nextDouble();
        double  SI=(P*R*T)/100;
        System.out.println("SIMPLE INTEREST = "+SI);

    }
}

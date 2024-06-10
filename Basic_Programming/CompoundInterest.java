//Java Program for compound interest
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
import java.io.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE Principal : ");
        double P = sc.nextDouble();
        System.out.println("ENTER THE Rate : ");
        double R = sc.nextDouble();
        System.out.println("ENTER THE Time : ");
        double T = sc.nextDouble();
        double CI=P*(Math.pow((1+R/100),T));//P*(1+R/100)^T
        System.out.println("SIMPLE INTEREST = "+CI);


    }


}

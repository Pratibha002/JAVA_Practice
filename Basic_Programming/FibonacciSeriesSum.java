package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class FibonacciSeriesSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int a=0;
        int b=1;
        int nextTerm=0;
        System.out.print("Fibonacci Series  : ");
        for(int i=0; i<=num; i++){
            System.out.print(a+" ");
             nextTerm=a+b;
             a=b;
             b=nextTerm;

        }System.out.println(" ");
        System.out.println("Sum of fibonacci series = "+nextTerm);
    }
}

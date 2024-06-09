//Java Program to find even sum of fibonacci Series Till number N
package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class EvenSumOfFibonacciSeries {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :  ");
        int num = sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        int nextTerm;
        System.out.println("Fibonacci Series up to " + num + " terms:");
        for(int i=0; i<=2*num; i++ ){
            System.out.print(a+" ");
            if(i%2==0){
                sum=sum+a;
            }
            nextTerm=a+b;
            a=b;
            b=nextTerm;


        }System.out.println(" ");
        System.out.print("Sum of Even Fibonacci Numbers  = "+sum);
         sc.close();
    }
}

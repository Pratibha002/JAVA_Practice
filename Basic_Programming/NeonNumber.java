//Java Program to Check If a Number is Neon Number or Not
//A neon number is a number where the sum of digits of the square of the number is equal to the number.
// The task is to check and print neon numbers in a range.
//example 9-->9*9=81, 8+1=9
package JAVA_Practice.Basic_Programming;

import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        int sum=0;
        int sq=num*num;
        while (sq>0){
            int r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }if(sum==num){
            System.out.println("YES Given Number "+num+" is NEON Number !!");
        }else{
            System.out.println("NO Given Number "+num+" is NOT A NEON Number !!");
        }sc.close();
    }
}

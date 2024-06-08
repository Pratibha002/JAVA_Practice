//Java Program for factorial of a number
package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        int mul =1;
        for(int i=num; i>0; i--){
            mul=mul*i;

        }System.out.println("Factorial of number "+num+" is = "+mul);
        sc.close();
    }
}

//Java Program to Check if a Given Integer is Odd or Even
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int num =sc.nextInt();
        if(num%2==0){
            System.out.println("Given number "+num+" is even number ");
        }else{
            System.out.println("Given number "+num+" is odd number ");
        }

    }
}

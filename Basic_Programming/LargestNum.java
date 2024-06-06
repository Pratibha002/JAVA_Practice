//Java Program to Find the Largest of three Numbers
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num 1 : ");
        int num1 = sc.nextInt();
        System.out.println("enter the num 2 : ");
        int num2 = sc.nextInt();
        System.out.println("enter the num 3 : ");
        int num3 = sc.nextInt();

        if((num1>num2)&&(num1>num3)){
            System.out.println("NUM1 :  "+ num1 +" IS THE LARGEST OF THREE NUMBERS  ");
        }else if((num2>num1)&&(num2>num3)){
            System.out.println("NUM2 : "+ num2 +" IS THE LARGEST OF THREE NUMBERS ");
        }else{
            System.out.println("NUM3 : "+ num3 +" IS THE LARGEST OF THREE NUMBERS  ");
        }
        sc.close();
    }
}

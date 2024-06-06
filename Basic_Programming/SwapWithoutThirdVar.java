//Java Program to Swap Two Numbers Without Using Third Variable.
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class SwapWithoutThirdVar {
    public static void main(String[] args){
//        int num1=10;
//        int num2=20;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int num1=  sc.nextInt();
        System.out.println("Enter the num2 : ");
        int num2=  sc.nextInt();
        System.out.println("NUMBER BEFORE SWAPPING : ");
        System.out.println("num1 = "+num1);
        System.out.println("num2  = "+num2);

        num1=num1+num2;//num1=30
        num2=num1-num2;//num2=10
        num1=num1-num2;//num1=20
        System.out.println("NUMBER AFTER SWAPPING : ");
        System.out.println("num1 = "+num1);
        System.out.println("num2  = "+num2);
        sc.close();
    }
}

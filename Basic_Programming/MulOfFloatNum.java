//Java Program to Multiply Two Floating-Point Numbers
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class MulOfFloatNum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        float num1=  sc.nextFloat();
        System.out.println("Enter the num2 : ");
        float num2=  sc.nextFloat();
        float mul=num1*num2;
        System.out.println("MULTIPLICATION OF NUM1 AND NUM2 =  : "+mul);
        sc.close();

    }
}

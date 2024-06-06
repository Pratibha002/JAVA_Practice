package JAVA_Practice;
import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args){
//        int num1=10;
//        int num2=20;
        int tempNum;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int num1=  sc.nextInt();
        System.out.println("Enter the num2 : ");
        int num2=  sc.nextInt();
        System.out.println("NUMBER BEFORE SWAPPING : ");
        System.out.println("num1 = "+num1);
        System.out.println("num2  = "+num2);

        tempNum=num1;
        num1=num2;
        num2=tempNum;
        System.out.println("NUMBER AFTER SWAPPING : ");
        System.out.println("num1 = "+num1);
        System.out.println("num2  = "+num2);

    }
}

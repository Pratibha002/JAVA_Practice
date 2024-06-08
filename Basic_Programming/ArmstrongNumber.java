//Java Program to Check Armstrong Number
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial number a :");
        int a=sc.nextInt();
        System.out.println("Enter the number b :");
        int b=sc.nextInt();

        for(int i=a; i<=b; i++){
            int num=i;
            int sum=0;
            while (num>0){
                int remainder=num%10;
                sum=sum+(remainder*remainder*remainder);
                num=num/10;
            }if (sum==i){
                System.out.println(sum);
            }
        }
    }
}

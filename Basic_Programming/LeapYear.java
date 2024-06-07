//Java Program to Find if a Given Year is a Leap Year
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num%4==0){
            System.out.println("Given Year " +num+ " is a Leap Year");
        }else{
            System.out.println("Given Year " +num+ " is Not a Leap Year");
        }
    }
}

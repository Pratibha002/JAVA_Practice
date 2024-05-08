//SUM of n numbers!!

package JAVA;
import java.util.Scanner;
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the natural number : ");
        int num = sc.nextInt();
        for(int i = 0; i<=num; i++){
            sum=sum+i;

        }System.out.println("THE SUM OF NATURAL NUMBER TILL "+num+" is = " +sum);
      sc.close();
    }
}

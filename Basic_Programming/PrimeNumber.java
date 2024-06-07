//Java Program to Display All Prime Numbers from 1 to N
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Prime numbers up to " + num + " are:");
        if (num <= 1) {
            System.out.println("Given number " + num + " is not a Prime number.");
        } else {
            for(int n=2; n<=num; n++){
                boolean isPrime = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(n+" ");
                }
            }

        }
    }
}




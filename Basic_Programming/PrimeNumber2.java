//check given number is prime number or not.
package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Given number " + num + " is not a Prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {//i=2, because 2 is smallest prime number
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Given number " + num + " is a Prime number.");
            } else {
                System.out.println("Given number " + num + " is not a Prime number.");
            }


        }
    }
}

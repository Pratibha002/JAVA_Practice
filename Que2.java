//SUM of n numbers!!

package JAVA_Practice;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the natural number : ");
        int num = s.nextInt();
        for (int i = 0; i <= num; i++) {
            sum = sum + i;

        }
        System.out.println("THE SUM OF NATURAL NUMBER TILL " + num + " is = " + sum);
        s.close();
    }
}

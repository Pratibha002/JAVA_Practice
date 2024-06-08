//Java Program to Check Whether the Character is Vowel or Consonant
package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cahracter : ");
        char c =sc.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
             c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("Given character "+c+ " is a 'VOWEL' ");
        }else{
            System.out.println("Given character "+c+ " is a 'CONSONANT' ");
        }sc.close();
    }
}

package JAVA_Practice.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String str =s.nextLine();

        StringBuilder rev =new StringBuilder(str);
        rev.reverse();

        if(str.contentEquals(rev)){
            System.out.println("Given String "+str+ " is Palindrome!!");
        }else {
            System.out.println("Given String "+str+ " is not a Palindrome!!");
        }
    }
}

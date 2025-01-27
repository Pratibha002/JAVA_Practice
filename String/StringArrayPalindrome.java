package JAVA_Practice.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n= sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the Strings in an array: ");
        String [] str =new String[n];
        for(int i=0; i<n; i++){

            str[i]=sc.nextLine();
        }
        System.out.println("Given String: ");
        System.out.print(Arrays.toString(str) +" ");
            StringArrayPalindrome obj = new StringArrayPalindrome();

        if (obj.palindrome(str)){
            System.out.println("is Palindrome");
        }else{
            System.out.println("is not a Palindrome");
        }
    }

    public boolean palindrome(String [] s){

        for(String word: s){
            StringBuilder rev = new StringBuilder(word);

            rev.reverse();
            if (!word.equals(rev.toString())){
             return false;
            }
        }
        return true;
    }
}

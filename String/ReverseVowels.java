package JAVA_Practice.String;

import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word/sentence : ");
        String s =sc.nextLine();
        StringBuilder result =new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')||
                    ( s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')){
                result.append(s.charAt(i));
                result.reverse();
            }
        }System.out.println("Reverse vowel of given string: "+result);
    }
}

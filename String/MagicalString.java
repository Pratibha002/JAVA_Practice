package JAVA_Practice.String;

import java.util.Scanner;

public class MagicalString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s =sc.nextLine();
        StringBuilder sb =new StringBuilder();
        System.out.println("Magical String : ");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                char c =(char) ('a'+'z'-s.charAt(i));//ASCII value of 'a'=97 & ASCII value of 'z'=122
                System.out.print(c+"");
            }else{
                System.out.println("invalid string !!");
            }
        }

    }
}
/*
class Solution{
    static String magicalString(String S){
       StringBuilder sb = new StringBuilder();
       for(int i=0; i<S.length(); i++){
               if(S.charAt(i)>='a' && S.charAt(i)<='z'){
               char c =(char) ('a'+'z'-(S.charAt(i)));
               sb.append(c);
           }
       }return sb.toString();
    }
}
 */
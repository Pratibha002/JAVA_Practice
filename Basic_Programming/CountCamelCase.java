package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class CountCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
       // String s = "heLLOjAvA";
        String s = sc.nextLine();
        int count=0;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(Character.isUpperCase(c)){
                  count++;
            }
        }
        System.out.println("Count of uppercase character in given string is : "+count);
    }
}

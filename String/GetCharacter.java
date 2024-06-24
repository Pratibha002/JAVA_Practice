//Java Program to get a character from a String
package JAVA_Practice.String;

import java.util.Scanner;

public class GetCharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s =sc.nextLine();
        System.out.println();
        int index=0;
        System.out.println("Enter the index value : ");
        try{
             index = sc.nextInt();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Insert index value within the range : ");
        }

        System.out.println("character at position "+index +" is : "+s.charAt(2));
        sc.close();
    }
}

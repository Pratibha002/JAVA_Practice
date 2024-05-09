package JAVA_Practice;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : "); 
        int num = s.nextInt();
        num = num*num*num;
        System.out.println("THE CUBE OF GIVEN NMBER IS = " +num);
        s.close();    

    } 
}

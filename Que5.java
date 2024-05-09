package JAVA_Practice;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        num = num * num;
        System.out.println("THE SQUARE OF GIVEN NMBER IS = " + num);
        sc.close();

    }
}

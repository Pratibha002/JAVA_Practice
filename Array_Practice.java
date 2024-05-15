package JAVA_Practice;

import java.util.Scanner;

public class Array_Practice {
    public static void main(String[] args) {
        String[] a = {"Aman bhaiya", "Anurag bhaiya", "Akansha", "Ayushi", "Bhanu", "Madhuri", "Pratibha", "Ruchi"};
        boolean check = false;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME !!");
        String name = s.nextLine();

        for (int i = 0; i < a.length; i++) {
            if (a[i].toLowerCase().equals(name.toLowerCase())) {
                check = true;
                break; // No need to continue searching once the name is found
            }
        }

        if (check) {
            System.out.println("Welcome " + name + ", you are an authorized user!!");
        } else {
            System.out.println(name + ", you are an unauthorized user!!");
        }
        s.close();
    }
}
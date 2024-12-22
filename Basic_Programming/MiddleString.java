package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int midCharNum;
        if (s.length()%2==0){
            midCharNum=s.length()/2;
            midCharNum--;
            System.out.print(s.charAt(midCharNum));
            System.out.print(", "+s.charAt(midCharNum+1));

        }else {
            midCharNum=(s.length()+1)/2;
            midCharNum--;
            System.out.print(s.charAt(midCharNum));
        }

    }
}

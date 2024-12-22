package JAVA_Practice.Basic_Programming;
//optimized way to find middle element of the string
import java.util.Scanner;

public class MiddleString2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s =sc.nextLine();

        int stringLength =s.length();
        int midIndex =stringLength/2;

        if (stringLength%2==0){
            System.out.println(s.charAt(midIndex-1)+", "+s.charAt(midIndex));
        }else {
            System.out.println(s.charAt(midIndex));
        }

    }
}

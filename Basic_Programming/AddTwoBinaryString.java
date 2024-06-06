//Java Program to Add Two Binary Strings
package JAVA_Practice.Basic_Programming;
import java.util.Scanner;
public class AddTwoBinaryString {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
//            String x = "011011";
//            String y = "1010111";
            String x = sc.toString();
            String y = sc.toString();
            int num1 = Integer.parseInt(x, 2);
            int num2 = Integer.parseInt(y, 2);
            int sum = num1 + num2;
            String result = Integer.toBinaryString(sum);
            System.out.print("The sum of two binary numbers : "+x+" + "+y+" = "+result);
            sc.close();
        }
    }



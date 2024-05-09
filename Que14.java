//find the largest of five numbers
package JAVA_Practice;

public class Que14 {
    public static void main(String[] args) {
        int num1 = -5;
        int num2 = -2;
        int num3 = -6;
        int num4 = 0;
        int num5 = -1;

        if ((num1 > num2 && num1 > num3) && (num1 > num4 && num1 > num5)) {
            System.out.println("NUM1 " + num1 + " IS THE BIGGEST NUMBER !!");
        } else if ((num2 > num1 && num2 > num3) && (num2 > num4 && num2 > num5)) {
            System.out.println("NUM2 " + num2 + " IS THE BIGGEST NUMBER !!");
        } else if ((num3 > num1 && num3 > num2) && (num3 > num4 && num3 > num5)) {
            System.out.println("NUM3 " + num3 + " IS THE BIGGEST NUMBER !!");
        } else if ((num4 > num1 && num4 > num3) && (num4 > num2 && num4 > num5)) {
            System.out.println("NUM4 " + num4 + " IS THE BIGGEST NUMBER !!");
        } else if ((num5 > num1 && num5 > num3) && (num5 > num4 && num5 > num2)) {
            System.out.println("NUM5 " + num5 + " IS THE BIGGEST NUMBER !!");
        } else {
            System.out.println("default NUMBER !!");
        }

    }
}

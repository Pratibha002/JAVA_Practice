package JAVA_Practice.Basic_Programming;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH : ");
        double L = sc.nextDouble();
        System.out.println("ENTER THE BREADTH : ");
        double B = sc.nextDouble();
        double perimeter=2*(L+B);
        System.out.println("Perimeter of a Rectangle = "+perimeter);
    }
}

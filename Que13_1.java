package JAVA_Practice;

import java.util.Scanner;

public class Que13_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number2 = ");
        int num2 =  sc.nextInt();
        System.out.print("Enter a number3 = ");
        int num3 =  sc.nextInt();

        if((num1>num2)&&(num1>num3)){
         if(num2>num3){
            System.out.println("largest number = " +num1);
            System.out.println("middle number = " +num2);
            System.out.println("smallest number = " +num3);}
            if(num2<num3){
                System.out.println("largest number = " +num1);
                System.out.println("smallest number = " +num3);
                System.out.println("middle number = " +num2);
                  
            }
         
        }
        else if((num2>num3)&&(num2>num1)){
          if(num3>num1){
            System.out.println("largest number = " +num2);
            System.out.println(" middle number = " +num3);
            System.out.println("smallest number = " +num1);}
            if(num3<num1){
                System.out.println("largest number = " +num2);
                System.out.println(" middle number = " +num1);
                System.out.println("smallest number = " +num3);
            }
          
        }
        else if((num3>num1)&&(num3>num2)){
         if(num1>num2){
            System.out.println("largest number = " +num3);
            System.out.println(" middle number = " +num1);
            System.out.println("smallest number = " +num2);}
            if(num1<num2){
                System.out.println("largest number = " +num3);
                System.out.println(" middle number = " +num2);
                System.out.println("smallest number = " +num1);
            }
         
        } 
        sc.close();
}
}

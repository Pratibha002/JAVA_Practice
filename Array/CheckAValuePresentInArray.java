//Java Program to Search an Element in an Array
package JAVA_Practice.Array;

import java.util.Scanner;

public class CheckAValuePresentInArray {
    public static void main(String[] args){
       int a[] = {5, 1, 1, 9, 7, 2, 6, 10};
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the Key Value : ");
       int keyValue = sc.nextInt();
       boolean valueFound=false;
       for(int i=0; i<a.length; i++){
           if(a[i]==keyValue){
               valueFound=true;
           }
       }if(valueFound){
            System.out.println("Key Value is Present in an Array !!");
        }else{
            System.out.println("Key Value is not Present in an Array !!");
        }
    }
}

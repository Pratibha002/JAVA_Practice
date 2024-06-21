//Java Program to Check if two Arrays are Equal or not with the help of .equals() method
package JAVA_Practice.Array;

import java.util.Arrays;

public class CheckArraysAreEqualOrNot2 {
    public static void main(String[] args) {
        int  arr1[] = {1, 2, 5, 4, 0};
        int  arr2[] = {1, 2, 5, 4, 0};
        boolean isEqual= Arrays.equals(arr1,arr2);
        if(isEqual){
            System.out.println("Given two arrays are same!!");
        }else {
            System.out.println("Given two arrays are not same!!");
        }

    }
}

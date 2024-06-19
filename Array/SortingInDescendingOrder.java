//Java Program to Sort the Array Elements in Descending Order
package JAVA_Practice.Array;

import java.util.Arrays;

public class SortingInDescendingOrder {
    public static void main(String[] args){
        int [] a = {2, 6, 23, 98, 24, 35, 78};
        Arrays.sort(a);
        System.out.println("Sorted Array : " +Arrays.toString(a));//[2, 6, 23, 24, 35, 78, 98]
//        for(int i=0; i<a.length; i++){
//            for(int j=i+1; j<a.length; j++){
//                if(a[i]>a[j]){
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }for(int i : a){
//            System.out.print(i+" ");
//        }
        for(int i=0; i< a.length/2; i++){
           int temp=a[i];
           a[i]=a[a.length-i-1];
           a[a.length-i-1]=temp;

        }
        System.out.println();
        System.out.println("Sorted Array in Descending Order : ");
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}

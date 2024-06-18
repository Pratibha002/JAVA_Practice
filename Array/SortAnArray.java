//Java Program to Sort an Array.
package JAVA_Practice.Array;

public class SortAnArray {
    public static void main(String[] args){
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        int temp=0;
        System.out.println("Given Array : ");
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
        System.out.println("Sorted Array : ");
        for(int i=0; i<arr.length; i++){
           for(int j=i+1; j<arr.length; j++){
               if(arr[i]>arr[j]){
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
               }
           }
        }for(int i : arr){
            System.out.print(i+", ");
        }

    }
}

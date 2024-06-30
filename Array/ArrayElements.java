//Given an array, the task is to find all elements in array except two greatest elements in sorted order.
package JAVA_Practice.Array;


public class ArrayElements {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8,9};
        for(int i=0; i< a.length-2; i++){
            System.out.print(a[i]+" ");
        }
    }
}

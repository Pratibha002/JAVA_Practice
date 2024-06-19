//Java Program to Sort the Array Elements in Descending Order
package JAVA_Practice.Array;

import java.util.Arrays;
import java.util.Collections;

public class SortingInDescendingOrder2 {
    public static void main(String[] args) {
        Integer[] a = {2, 6, 23, 98, 24, 35, 78};
        //Here we use the methods of collection to sort the array in descending order.
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Sorted Array in Descending order  : " +Arrays.toString(a));

    }
}

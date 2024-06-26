//Find number of elements which are less than or equal to given element X.
package JAVA_Practice.Array;

import java.util.Arrays;

public class CountSmallerElements {
    public static void main(String[] args) {
        int [] a = {1,3,4,5,6, 7, 8 ,9};
        int x=7;
        int count=0;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            if(a[i]<=x){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
}

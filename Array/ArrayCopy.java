package JAVA_Practice.Array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] a = {1,3,4,5,6,2};
        System.out.println("original array: ");

        for(int i=0; i< a.length; i++ ){
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("================================================");
        int [] copy =Arrays.copyOf(a,a.length );
        System.out.println("Array copy : ");
        for(int i=0; i< copy.length; i++ ){
            System.out.print(copy[i]);
        }

    }
}

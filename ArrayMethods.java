package JAVA_Practice;

import java.util.Arrays;

public class ArrayMethods {
    public static void main (String [] args){
        int [] a ={1,2,3,4,5};
        int [] a2 ={1,2,3,4,5};
        int [] a3 ={3,6,1,8,4,2};
        int [] a4={1,2,3,6,8};
        System.out.println("Arrays.compare()");
        System.out.println("Return 0 if arrays are equal = "+Arrays.compare(a,a2));
        System.out.println("Return -1 if array1 is less than array2 = "+Arrays.compare(a,a3));
        System.out.println("Return 1 if array1 is greater than array2 = "+Arrays.compare(a3,a));

        System.out.println();
        System.out.println("sort()--> sort an array in ascending order");
        Arrays.sort(a3);
        for(int i: a3){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("binarySearch()");
        System.out.println("Index position of 5 is : "+Arrays.binarySearch(a,5));
        System.out.println("Index position of 2 is : "+Arrays.binarySearch(a2,5));
        System.out.println("Index position of 8 is : "+Arrays.binarySearch(a3,5));


        System.out.println();


        System.out.println("copyOF()");
        int [] copy= Arrays.copyOf(a3, 9);
        System.out.println(Arrays.toString(copy));

        System.out.println();

        System.out.println("equals()");
        System.out.println("Return true if arrays are equal : "+Arrays.equals(a,a2));
        System.out.println("Return false if arrays are not equal : "+Arrays.equals(a2,a3));

        System.out.println();
        System.out.println("Mismatch()--> returns the index position of mismatch b/w two arrays");
        System.out.println("Mismatch found at index position : "+Arrays.mismatch(a,a4));




        System.out.println();
        System.out.println("fill()");
       Arrays.fill(a2,5);
       for(int i:a2 ){
           System.out.println(i);
       }
        System.out.println();
        System.out.println("Arrays.fill(array,start, end, value)");
        Arrays.fill(a2,2,3,10);//index position of last element is exclude
        for(int i:a2 ){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("length");
        System.out.println("Array length : "+a.length);
        System.out.println("Array2 length : "+a2.length);
        System.out.println("Array3 length : "+a3.length);
        System.out.println("Array4 length : "+a4.length);


        System.out.println();
        System.out.println(" 'toString()' method ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a4));
        System.out.println(Arrays.toString(a3));






    }
}

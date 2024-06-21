//Java Program to Merge Two Arrays
package JAVA_Practice.Array;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int a1=arr1.length;
        int a2=arr2.length;
        //creates an array with the combined length of arr1 and arr2.
        int []mergedArray=new int[a1+a2];//it creates new integer array of length of sum of both given array arr1 & arr2

        for(int i=0; i<arr1.length; i++){
            mergedArray[i]=arr1[i];
//            System.out.print(mergedArray[i]+" ");{1, 3, 4, 5, 0, 0, 0, 0}
        }

        for(int i=0; i<arr2.length; i++){  //a1=4
            mergedArray[a1+i]=arr2[i];    //[a1+i]--> [4+0]=2-->mergedArray[4]=2  {1, 3, 4, 5, 2, 0, 0, 0}
                                          //          [4+1]=4-->mergedArray[5]=4  {1, 3, 4, 5, 2, 4, 0, 0}
                                          //          [4+2]=6-->mergedArray[6]=6  {1, 3, 4, 5, 2, 4, 6, 0}
                                          //          [4+3]=8-->mergedArray[8]=8  {1, 3, 4, 5, 2, 4, 6, 8}
        }
        System.out.println("Merged Array : ");
        for(int i : mergedArray){
            System.out.print(i+" ");
        }
    }
}

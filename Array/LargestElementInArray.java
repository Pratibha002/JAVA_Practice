//Find the Largest Element in an Array
package JAVA_Practice.Array;

public class LargestElementInArray {
    public static void main(String[] args){
        int a[] = {20, 10, 20, 4, 100};
        System.out.println("Given array : " );
        int maxElement=a[0];
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
           if(maxElement<a[i]){
               maxElement=a[i];
           }
        }
        System.out.println();
        System.out.println("Maximum element of given array is : "+maxElement);
    }
}

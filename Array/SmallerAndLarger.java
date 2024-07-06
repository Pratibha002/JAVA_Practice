//Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X.
package JAVA_Practice.Array;

public class SmallerAndLarger {
    public static void main(String[] args) {
        int a[] = {1, 2, 8, 10, 11, 12, 19};
        int x=8;
        int moreCount=0;
        int lessCount=0;
        for(int i=0; i<a.length;i++){
            if(a[i]>=x){
                moreCount++;
            }
            if(a[i]<=x){
                lessCount++;
            }
        }
         System.out.println("Number of elements less than or equal to " + x + ": " + lessCount);
         System.out.println("Number of elements more than or equal to " + x + ": " + moreCount);
    }
}

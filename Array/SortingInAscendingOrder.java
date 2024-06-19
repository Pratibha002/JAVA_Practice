//Java Program to Sort the Elements of an Array in Ascending Order
package JAVA_Practice.Array;

public class SortingInAscendingOrder {
    public static void main(String [] args) {
        int [] a ={-5,	-9,	8,	12,	1,	3};
        System.out.println("Given Array : ");
        for(int i : a){
            System.out.print(i+" ");
        }
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array in ASCENDING ORDER : ");
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}

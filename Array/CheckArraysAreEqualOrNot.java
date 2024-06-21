//Java Program to Check if two Arrays are Equal or not
package JAVA_Practice.Array;

public class CheckArraysAreEqualOrNot {
    boolean isEqual=true;
    public void checkArray(int [] a, int [] a2 ){

        if(a.length!=a2.length){
            isEqual=false;
        }else{
            for(int i=0; i<a.length; i++){
                if(a[i]!=a2[i]){
                    isEqual=false;
                }
            }
        }
        if(isEqual){
            System.out.println("Given two arrays  are same!!");
        }else {
            System.out.println("Given two  arrays are not same!!");
        }
    }


    public static void main(String[] args) {

       CheckArraysAreEqualOrNot obj=new CheckArraysAreEqualOrNot();
        int  arr1[] = {1, 2, 5, 4, 0};
        int  arr2[] = {1, 2, 5, 4, 0};
        int arr3[] = {1, 2, 5, 4, 0, 2};
        int arr4[] = {1, 7, 7};

        obj.checkArray(arr1,arr2);
        obj.checkArray(arr3,arr4);


    }
}

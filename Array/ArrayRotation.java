package JAVA_Practice.Array;

public class ArrayRotation {
    public static void main(String[] args) {
        int [] a ={2,4,5,7,8,35,77};
        int d =2;
        int temp=0;
        for(int i=d; i<a.length; i++){  // desired o/p --> 5,7,8,35,77,2,4
//            System.out.println(a[i]);
            temp=a[i];
            System.out.print(temp+ " ");
        }
        for(int i=0; i<d; i++){
            System.out.print(a[i]+" ");
        }
    }
}

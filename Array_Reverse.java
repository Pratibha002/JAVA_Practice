package JAVA_Practice;

public class Array_Reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.print("ORIGINAL ARRAY : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.print("REVERSE ARRAY : ");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}

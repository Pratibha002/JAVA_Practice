package JAVA_Practice.Array;

public class SwapKthElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k =3;
        int temp=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==k){
                temp=arr[i];
                arr[i]=arr[arr.length-k];
                arr[arr.length-k]=temp;

            }System.out.print(arr[i]+" ");//o/p-->1 2 6 4 5 3 7 8
        }
    }
}

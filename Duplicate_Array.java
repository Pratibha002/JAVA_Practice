package JAVA_Practice;

public class Duplicate_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int arr2[]={1,2,3,4};
       
        boolean check = false;

        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    check=true;
                    break;
                }
            }
        }
        System.out.println("FIRST ARRAY HAS THE DUPLICATE ELEMENT: "+check);
                           
        check=false;
        for(int i = 0; i<arr2.length; i++){
            for(int j=0; j<i; j++){
                if(arr2[i]==arr2[j]){
                    check=true;
                    break;
                }
            }
        }
        System.out.println("SECOND ARRAY HAS THE DUPLICATE ELEMENT: "+check);
    }
}

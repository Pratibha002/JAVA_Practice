package JAVA_Practice;

public class ArrayMaxElement {
    public static void main(String[] args) {
        int arr[]={3,5,4,1,9};
        int arr_2[]={22,14,8,17,35,3};
        System.out.print("GIVEN ARRAY :  "); 
        int maxElement = arr[0];
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
            
            if(maxElement<arr[i]){
                maxElement=arr[i];
            }
         } System.out.println();
         System.out.println("MAXIMUM ELEMENT :  " +maxElement);


         System.out.print("GIVEN ARRAY :  "); 
         for(int i = 0; i<arr_2.length; i++){
            System.out.print(arr_2[i] +" ");
            
            if(maxElement<arr_2[i]){
                maxElement=arr_2[i];
            }
         } System.out.println();
         System.out.print("MAXIMUM ELEMENT :  " +maxElement);
       

         
          

    }
}

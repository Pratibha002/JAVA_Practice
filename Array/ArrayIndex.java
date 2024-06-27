package JAVA_Practice.Array;

public class ArrayIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 4, 5 };
        int key = 5;
        int startIndex=-1;
        int endIndex=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                if(startIndex==-1){
                    startIndex=i;
                }endIndex=i;

            }
        }System.out.println("Start index of key element "+key +" is : "+startIndex);
        System.out.println("Last index of key element "+key+" is : "+endIndex);
    }
}

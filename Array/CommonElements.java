package JAVA_Practice.Array;


public class CommonElements {
    public static void main(String[] args) {

        String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };
        String[] arr2 = {  "Geeks", "for", "Geeks" };

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j< arr2.length; j++){
                if((arr1[i]!=null && arr2[j]!=null)&&(arr1[i].equals(arr2[j]))){
                    System.out.println("Common elements : "+arr1[i]);
                    arr1[i]=null;
                    arr2[j]=null;
                    break;
                }
            }
        }
    }
}

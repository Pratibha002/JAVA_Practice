//Remove all occurrences of an element from Array in Java
package JAVA_Practice.Array;

public class RemoveOccurrenceOfAnElement {
    public static void main(String[] args) {

        int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        boolean isUnique=true;
        System.out.println("Unique Elements : ");
        for(int i=0; i<a.length; i++){
           for(int j=0; j<i; j++){
               if(a[i]==a[j]){
                   isUnique=false;
                   break;
               }isUnique=true;
           }if(isUnique){
               System.out.print(a[i]+" ");
           }
       }
    }
}

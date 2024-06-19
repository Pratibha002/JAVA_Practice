package JAVA_Practice.Array;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] a= {1, 2, 2, 3, 4, 4, 4, 5, 5};
        System.out.println("Unique Elements ");
        for(int i=0; i< a.length; i++){
            boolean duplicate=false;
            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    duplicate=true;
                    break;
                }
            }if(!duplicate){
                System.out.print(a[i]+" ");
            }

        }
    }
}

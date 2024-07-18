package JAVA_Practice.Array;

public class ImmediateSmallerElements {
    public static void main(String[] args) {
        int [] a = {4, 2, 1, 5, 3};
        int n=a.length;
        for(int i=0; i<n-1; i++){
            if(a[i]>a[i+1]){
               a[i]=a[i+1];
//                System.out.println(a[i]);
            }else{
                a[i]=-1;
//                System.out.println(a[i]);
            }
        }a[n-1]=-1;
//        System.out.println(a[n-1]);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}

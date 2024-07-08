package JAVA_Practice.Array;

public class AverageInStream {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        float sum=0;
        float avg=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            avg=sum/(i+1);
            System.out.print(avg+" ");

        }
    }
}

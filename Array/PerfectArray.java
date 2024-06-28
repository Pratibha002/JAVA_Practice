package JAVA_Practice.Array;

public class PerfectArray {
    public static void main(String[] args) {
        int [] a ={1,2,3,2,1};
        boolean isPerfect=false;
        for (int i=0; i<a.length; i++){
            if(a[i]==a[a.length-1-i]){
                isPerfect=true;
            }else {
                isPerfect=false;
            }
        }if(isPerfect){
            System.out.println("PERFECT ARRAY !!");
        }else{
            System.out.println("NOT PERFECT ARRAY !!");
        }
    }
}

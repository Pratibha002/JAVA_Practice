package JAVA_Practice.Pattern;

public class HollowRhombus {
    public static void main(String[] args) {
        int n =5;//row
        int m=5;//column
        for(int i=1; i<=n; i++){
             //for space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //print star
            for (int j=1; j<=n; j++){
                if (i==1 || j==1 || i==n || j== m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

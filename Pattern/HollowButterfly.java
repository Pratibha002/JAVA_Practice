package JAVA_Practice.Pattern;

public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5;


        //upper half
        for (int i=1; i<=n; i++){

            //1st half
            for (int j=1; j<=i; j++){

                if (i==1 || j==1 || i==n ||j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            //for space
            int space = 2*(n-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //2nd half
            for (int j=1; j<=i; j++){
                int m=i-j;
                if (i==1 || j==1 || i==n ||j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        //lower half
        for (int i=n; i>=1; i--){

            //1st half
            for (int j=1; j<=i; j++){

                if (i==1 || j==1 || i==n ||j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }

            //for space
            int space = 2*(n-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //2nd half
            for (int j=1; j<=i; j++){
                int m=i-j;
                if (i==1 || j==1 || i==n ||j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}

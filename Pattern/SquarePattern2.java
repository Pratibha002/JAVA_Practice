//Java Program to Print hollow Square Star Pattern
//   ************
//   *          *
//   *          *
//   *          *
//   ************
package JAVA_Practice.Pattern;

public class SquarePattern2 {
    public static void main(String[] args){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=12; j++){
                if(i==1||i==5||j==1||j==12){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } System.out.println();


        }
    }
}

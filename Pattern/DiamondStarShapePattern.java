//Java Program to Print Diamond Shape Star Pattern
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
package JAVA_Practice.Pattern;

public class DiamondStarShapePattern {
    public static void main(String [] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            } System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            } System.out.println();
        }
    }
}

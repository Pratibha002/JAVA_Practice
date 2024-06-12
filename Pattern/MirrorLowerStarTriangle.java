//Java Program to Print Mirror Lower Star Triangle Pattern
//* * * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
package JAVA_Practice.Pattern;//problem

public class MirrorLowerStarTriangle {
    public static void main(String[] args){
        for(int i=7; i>=1; i--){
            for(int j=7; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print( "* ");
            } System.out.println();
        }
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print( "* ");
            } System.out.println();
        }

    }
}

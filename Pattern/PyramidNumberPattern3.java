//         1
//      2  3  2
//    3  4  5  4  3
//  4  5  6 7  6  5  4
//
package JAVA_Practice.Pattern;

public class PyramidNumberPattern3 {
    public static void main(String[] args){
        for(int i=0; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }for(int j=1; j<=i; j++){
                System.out.print(" "+j);
            }System.out.println();
        }
    }
}

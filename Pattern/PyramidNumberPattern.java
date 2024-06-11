//     1
//    2  2
//   3  3  3
//  4  4  4  4
// 5  5  5  5  5
package JAVA_Practice.Pattern;

public class PyramidNumberPattern {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){//5-i determines how many spaces should be printed before the numbers in the current row.
                System.out.print(" ");
            }for(int j=1; j<=i; j++){
                System.out.print(" "+ i+" ");
            }System.out.println();
        }
    }
}

/* Floyd's Triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
package JAVA_Practice.Pattern;

public class FloydTriangle {
    public static void main(String[] args) {
        int n =5;
        int a = 1;

        for(int i=1; i<=n; i++){

            for (int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}

/*
    1
   2 3
  4 5 6
 7 8 9 10
11 12 13 14 15
for(int i=1; i<=n; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
 */
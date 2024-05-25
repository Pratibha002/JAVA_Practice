package JAVA_Practice;

// class Caculator{
//     public int callDiv(int a,int b){
//         Division ad = new Division();
//         int c=0;
//     try {
//         c= ad.div(a, b);
//     } catch (Exception e) {
//         System.out.println(e);
//     }
//     return c;
//     }
// }    
// class Division{
//     public int div(int a,int b)throws Exception {
        
//         return a/b;

//         // try {
//         //     c =a/b;
//         // } catch (Exception e) {
//         //     System.out.println(e.getMessage());
//         // }
//         // return c;
//     }
// }
import java.util.Scanner;
public class ThrowsKeyword {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=s.nextInt();
        // int a = 24;
        System.out.println("Enter the value of b: ");
        int b=s.nextInt();
        // int b = 0;
        
        try {
            int c = div(a, b); //call the div method
            System.out.println("division of two num :"+c);//The caller to these methods has to handle the exception using a try-catch block. 
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
    public static int div(int a, int b) throws Exception {
       
        return a / b; 
    }
}

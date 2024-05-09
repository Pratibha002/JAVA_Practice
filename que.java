package JAVA_Practice;

import java.util.Scanner;
public class que {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number = " );
        int num =s.nextInt();
        for(int i = 1; i <=num; i++){
            if(i % 2 != 0){
                System.out.println("odd number = " +i);
            }
        }
        s.close();
    }
}



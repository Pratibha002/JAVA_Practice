//Sort a String in Java
package JAVA_Practice.String;

import java.util.Arrays;

public class SortString2 {
    public static void main(String[] args) {
        String s ="helloworld";
        char [] c =s.toCharArray();
        char temp=0;
        for(int i=0; i<c.length; i++){
            for(int j=i+1; j<c.length; j++){
                if(c[i]>c[j]){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;

                }
            }
        }System.out.println("Sorted String : "+ Arrays.toString(c));
    }
}

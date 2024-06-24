//Reverse a string in Java by using .reverse() method
package JAVA_Practice.String;

public class ReverseString2 {
    public static void main(String[] args) {
        String s ="hello world";
        System.out.println("Original String : "+s);
        StringBuffer sb =new StringBuffer(s);
        System.out.println("Reversed String : "+sb.reverse());
    }
}

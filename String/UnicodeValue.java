//Java Program to Determine the Unicode Code Point at Given Index in String
package JAVA_Practice.String;

public class UnicodeValue {
    public static void main(String[] args) {
        String s= "JAVA";
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) +"="+s.codePointAt(i)+" ");
        }
    }
}

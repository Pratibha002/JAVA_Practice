//Compare two Strings in Java
package JAVA_Practice.String;

public class CompareStrings {
    public static void main(String[] args) {
        String s1= "Hello Java";
        String s2= "hello world";
        String s3= "hello java";
        String s4= "Hello World";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));


    }
}

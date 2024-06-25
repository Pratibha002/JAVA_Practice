//Sort a String in Java
package JAVA_Practice.String;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "helloworld";
        char [] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println("Sorted string : "+(Arrays.toString(c)));
    }
}

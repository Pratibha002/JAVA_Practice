package JAVA_Practice;

import java.util.*;

public class StackPractice {
    public static void main(String [] args ){
        Stack <String> s = new Stack<String>();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
        System.out.println(s.empty());


    }
}

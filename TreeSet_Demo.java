package JAVA_Practice;

import java.util.*;

public class TreeSet_Demo {
    public static void main (String[]args){
        TreeSet<String> s =new TreeSet<>();
        s.add("A");//Unicode Value-> 67
        s.add("a");//Unicode Value-> 97
        s.add("B");
        s.add("Z");
        s.add("L");
        //s.add(new Integer(10));//Class cast exception
        //t.add(null); //nullPointerException, we can add null only on empty set after any element we can't use it,and after adding null we can't add any element still give this error
        System.out.println(s);// [A, B, L, Z, a]
       //A-->unicode value(67), "a"-->unicode value(97)
    }
}

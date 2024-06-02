package JAVA_Practice;

import java.util.TreeSet;

public class TreeSet_Demo1 {
    public static void main (String[]args){
        TreeSet<StringBuffer> s =new TreeSet<StringBuffer>();
        s.add(new StringBuffer("A"));
        s.add(new StringBuffer("B"));
        s.add(new StringBuffer("Z"));
        s.add(new StringBuffer("L"));
        System.out.println(s);
        System.out.println("A".compareTo("Z"));//-ve
        System.out.println("Z".compareTo("B"));//+ve
        System.out.println("A".compareTo("A"));//0
        System.out.println("A".compareTo("null"));//NullPointerException


    }
}

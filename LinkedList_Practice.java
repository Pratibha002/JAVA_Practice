package JAVA_Practice;
import java.util.*;
public class LinkedList_Practice {
    public static void main(String [] args){
        LinkedList<Object> l =new LinkedList<Object>();
        l.add("Hello");
        l.add(30);
        l.add(null);
        l.add("Hello");
        l.set(0, "Java");
        l.add(0,"World");
        l.addFirst("Globe");
        System.out.println(l);

    }
}

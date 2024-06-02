package JAVA_Practice;
import java.util.*;
public class LinkedList_Practice {
    public static void main(String [] args){
        LinkedList<Object> l =new LinkedList<Object>();
        l.add("Hello");
        l.add(30);
        l.add(null);
        l.add("Hello");
        System.out.println(l);
        l.set(0, "Java");//it performs replacement, Hello is replaced by Java
        System.out.println(l);//[Java, 30, null, Hello]
        l.add(0,"World");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst("Globe");
        System.out.println(l);

    }
}

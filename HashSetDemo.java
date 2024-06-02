package JAVA_Practice;

import java.util.*;

public class HashSetDemo {
    public static void main (String[] args){
        HashSet<Object> h =new HashSet<Object>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add(null);
        h.add(10);
        System.out.println(h);//insertion order is not preserved.
        System.out.println(h.add("D"));//duplicates are not allowed. If we are trying to insert duplicates, we
        //won't get any compile time or runtime errors. add() method simply return false
        System.out.println(h);

    }
}

package JAVA_Practice;
import java.util.*;
public class Cursor_ListIterator {
    public static void main(String [] args){
        LinkedList<String> ll =new LinkedList<String>();
        ll.add("Balakrishna");
        ll.add("Chiru");
        ll.add("Venky");
        ll.add("Nag");
        ll.add("Balakrishna");
        System.out.println(ll);
        ListIterator<String> ltr =ll.listIterator();
        while(ltr.hasNext()){
            String s= (String)ltr.next();
            if(s.equals("Venky")){
                ltr.remove();
            }else if(s.equals("Nag")){
                ltr.add("Chaitanya");
            }else if(s.equals("Chiru")){
                ltr.set("Charan");
            }
        } System.out.println(ll);

    }
}

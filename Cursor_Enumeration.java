package JAVA_Practice;

//import java.util.Enumeration;
import java.util.*;

public class Cursor_Enumeration {
    public static void main(String [] args){
        Vector <Integer> v = new Vector<Integer>();
        for (int i=0; i<=10; i++){
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration<Integer> e =v.elements();//it is used with vector, old legacy collections
        while(e.hasMoreElements()){
            Integer I =(Integer)e.nextElement();//here we perform typeCasting because e.nextElement return type is object
            if((I%2)==0){
                System.out.println(I);
            }
        }
        System.out.println(v);
    }
}

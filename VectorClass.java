package JAVA_Practice;
import java.util.*;
public class VectorClass {
    public static void main(String [] args){
        Vector<Object> v =new Vector<Object>();//empty vector
        System.out.println(v.capacity());
        for(int i=0; i<10; i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");//When it reaches its max capacity size get double increase by this formula
        System.out.println(v.capacity());//[new capacity = 2* current capacity]
        System.out.println(v);

        System.out.println();

        Vector<Object> v1 =new Vector<Object>(25);//initial vector capacity
        System.out.println(v1.capacity());
        for(int i=0; i<10; i++){
            v1.addElement(i);
        }
        System.out.println(v1.capacity());
        v1.addElement("A");//here it won't reach its max capacity so size will be same
        System.out.println(v1.capacity());
        System.out.println(v1);



        System.out.println();

        Vector<Object> v2 =new Vector<Object>(10,5);//initial capacity, incremental capacity
        System.out.println(v2.capacity());
        for(int i=0; i<10; i++){
            v2.addElement(i);
        }
        System.out.println(v2.capacity());
        v2.addElement("A");//here capacity increase by the value of 5 instead of double of Current capacity[2*cc]
        System.out.println(v2.capacity());
        System.out.println(v2);

    }
}

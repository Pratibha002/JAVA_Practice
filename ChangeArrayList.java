package JAVA_Practice;
import java.util.ArrayList;
public class ChangeArrayList {

        public static void main(String[] args) {
            ArrayList<String> s =new ArrayList<String>();
            s.add("Aman bhaiya");
            s.add("Anurag bhaiya");
            s.add("Bhanu");
            s.add("Ruchi");
            s.add("Pratibha");
            System.out.println(s);
            //to change the element we use the set method
            System.out.println("After changing the element");
            s.set(3,"Ruchi tiwari");
            System.out.println(s);
            System.out.println("Remove the element from array list");
            s.remove(4);
            System.out.println(s);



        }
    }


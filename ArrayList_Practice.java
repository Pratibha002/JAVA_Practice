package JAVA_Practice;
import java.util.*;
public class ArrayList_Practice {
    public static void main(String[] args){

        //Using generics is recommended to enforce type safety and avoid potential type-related errors.
        ArrayList<Object> l = new ArrayList<Object> ();//here we use generics for type safety

        l.add("A");//String
        l.add(10);//integer
        l.add("A");//Sting , it allows duplicate
        l.add(9.5);//double
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2,"M");
        l.add("n");
        System.out.println(l);

        System.out.println();
        ArrayList l2 = new ArrayList ();//withuot generics it gives the warning because of safety purpose.
        l2.add("A");////it lacks type safety
        l2.add(10);
        l2.add("A");
        l2.add(9.5);
        System.out.println(l2);
        l2.remove(2);
        System.out.println(l2);
        l2.add(2,"M");
        l2.add("n");
        System.out.println(l2);

        /*What is generics?  -->generic-->type safe(ArrayList <String> l = new ArrayList<String>();)
        Generics in Java is a powerful feature that allows you to define classes, interfaces,
        and methods with a placeholder for the type of data they operate on. This type safety feature
        provides stronger type checks at compile time, eliminating many common programming errors.*/

        /*Why Use Object?
         Flexibility: Using Object allows the ArrayList to hold any type of object, making the collection
                      very flexible.
         Type Safety: To avoid runtime errors, it's better to use generics with a specific type, but using
                      Object is useful in some situations where the type of objects is not known beforehand or when the
                      list needs to hold multiple types of objects.
        */

        /* Using Object in an ArrayList allows you to store any type of object, but we lose type safety and need to
        cast objects back to their original types when retrieving them. Using generics with a specific type is
        generally preferred to ensure type safety and avoid runtime casting errors.*/

    }
}

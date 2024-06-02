package JAVA_Practice;
import java.util.*;
public class Cursor_ListIteratorPractice {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> li= new ArrayList<String>();
        li.add("Apple");
        li.add("Banana");
        li.add("Cherry");
        li.add("Date");

        // Obtaining a ListIterator
        ListIterator<String> listIterator = li.listIterator();

        // Traversing the list in forward direction
        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        // Traversing the list in backward direction
        System.out.println("\nBackward Traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }

        // Modifying the list during iteration
        System.out.println("\nModifying the list:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry"); // Replace "Banana" with "Blueberry"
            }
        }

        System.out.println("Modified list: " + li);
    }
}

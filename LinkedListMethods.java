package JAVA_Practice;

import java.util.*;

public class LinkedListMethods {
    public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();

            // Adding elements
            System.out.println("Adding elements");
            list.add("Apple");//[apple]
            list.add("Banana");//[apple,banana]
            list.addFirst("Orange");//[orange,apple,banana]
            list.addLast("Grapes");//[orange,apple,banana,grapes]
            list.add(2, "Mango");//[orange,apple,mango,banana,grapes]

            System.out.println("Initial List: " + list);
            System.out.println();

            System.out.println("Accessing elements");
            // Accessing elements
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());
            System.out.println("Element at Index 2: " + list.get(2));//by specifying index value
            System.out.println("PEEK() retrieve but does not remove head of the list: " + list.peek());
            System.out.println("peekFirst: " + list.peekFirst());
            System.out.println("peekLast: " + list.peekLast());

            // Using ListIterator to access and print elements
            ListIterator<String> iterator = list.listIterator();
            System.out.print("ListIterator: ");
            while (iterator.hasNext()) {
                    System.out.print(iterator.next() + " ");
            }
            System.out.println();
            System.out.println();

            System.out.println("Removing elements");
            // Removing elements
            list.remove("Banana");
            list.remove(1);
            list.removeFirst();
            list.removeLast();

            System.out.println("After Removals: " + list);
            System.out.println();

            System.out.println("Checking size and if empty");
            // Checking size and if empty
            System.out.println("Size: " + list.size());
            System.out.println("Is Empty: " + list.isEmpty());
            System.out.println();

            System.out.println("Using offer, poll, push, and pop");
            // Using offer, poll, push, and pop
            list.offer("Pineapple");
            System.out.println("After offer: " + list);
            System.out.println("Poll: " + list.poll());//retrieves and remove the first/head  element of the list
            System.out.println("After poll: " + list);
            System.out.println();

            list.push("Strawberry");
            System.out.println("After push: " + list);
            System.out.println("Pop: " + list.pop());
            System.out.println("After pop: " + list);
            System.out.println();

            System.out.println("Converting to array");
            // Converting to array
            Object[] array = list.toArray();
            System.out.println("Array: " + java.util.Arrays.toString(array));
        }
    }



package JAVA_Practice;
import java.util.ArrayList;
public class LoopArrayList {
        public static void main(String[] args) {
            ArrayList<String> fruits= new ArrayList<String>();
            fruits.add("Apple");
            fruits.add("Avocado");
            fruits.add("Banana");
            fruits.add("Kiwi");
            fruits.add("Mango");
            for(int i=0; i<fruits.size(); i++){
                System.out.println(fruits.get(i));
            }

        }
    }


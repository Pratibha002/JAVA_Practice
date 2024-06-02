package JAVA_Practice;
import java.util.*;
public class Cursor_Iterator {

    public static void main(String [] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            l.add(i);
        }
        System.out.println(l);
        Iterator<Integer> itr = l.iterator();//it is used with all collections
        while (itr.hasNext()) {
            Integer I = (Integer) itr.next();//here we perform typeCasting because e.nextElement return type is object
            if ((I % 2) == 0) {
                System.out.println(I);
            }else
                itr.remove();
        }
        System.out.println(l);
    }

}

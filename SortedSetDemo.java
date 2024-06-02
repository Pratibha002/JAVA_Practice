package JAVA_Practice;


import java.util.*;

public class SortedSetDemo {
    public static void main(String [] args){
        SortedSet<Integer> ss= new TreeSet<Integer>() ;//{
        ss.add(100);
        ss.add(101);
        ss.add(103);
        ss.add(104);
        ss.add(107);
        ss.add(110);
        ss.add(115);
        System.out.println(ss);

        // Getting the first and last elements
        System.out.println("First Element: " + ss.first());
        System.out.println("Last Element: " + ss.last());

        // Getting a subset of the SortedSet
        SortedSet<Integer> subSet = ss.subSet(103, 110);
        System.out.println("Subset (3 to 10): " + subSet);


        // Getting the head set
        SortedSet<Integer> headSet = ss.headSet(104);
        System.out.println("HeadSet (less than 104): " + headSet);


        // Getting the tail set
        SortedSet<Integer> tailSet = ss.tailSet(104);
        System.out.println("TailSet (104 and greater): " + tailSet);
//            @Override
//            public Comparator<? super Integer> comparator() {
//                return null;
//            }
//
//            @Override
//            public SortedSet<Integer> subSet(Integer fromElement, Integer toElement) {
//                return null;
//            }
//
//            @Override
//            public SortedSet<Integer> headSet(Integer toElement) {
//                return null;
//            }
//
//            @Override
//            public SortedSet<Integer> tailSet(Integer fromElement) {
//                return null;
//            }
//
//            @Override
//            public Integer first() {
//                return 0;
//            }
//
//            @Override
//            public Integer last() {
//                return 0;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Integer> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Integer integer) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Integer> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
   //     }
    }

}

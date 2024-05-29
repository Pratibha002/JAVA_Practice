package JAVA_Practice;

public class StringBufferMethods {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer("Hello");
        StringBuffer sb4 = new StringBuffer("Hello");
        StringBuffer sb5 = new StringBuffer("Hello");
        StringBuffer sb6 = new StringBuffer("Hello");
        System.out.println(sb);

        System.out.println("Reverse()");
        sb2.reverse();
        System.out.println(sb2);

        System.out.println("insert()");
        sb4.insert(1,"world");
        System.out.println("1,\"world\" "+sb4);

        System.out.println("replace()");
        sb5.replace(1,3,"world");
        System.out.println("1,3,\"world\" "+sb5);

        System.out.println("Capacity()");
        System.out.println(sb6.capacity());

        System.out.println("append()");
        System.out.println( " sb2.append(\"World\") "+sb2.append("World"));

        System.out.println("CharAt()");
        System.out.println("b3.deleteCharAt(3) "+sb3.deleteCharAt(3));

        System.out.println("delete()");
        System.out.println("sb3.delete(1,3);"+sb3.delete(1,3));



        System.out.println("length()");
        System.out.println(sb3.length());



    }
}

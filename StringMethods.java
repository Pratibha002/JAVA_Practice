package JAVA_Practice;

public class StringMethods {

    public static void main(String[] args) {

        String s = "Hello";
        String s1 ="hello";
        String s2="Hello world";
        String s3="Hello World";
        String s4="Hello";
        String s5="JAVA";
        String s6="HELLO|WORLD|JAVA|CODE|hello|Hello";
        String s7 = "     Hello java      ";

        char [] c = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.println("charAt()");
        System.out.println(s.charAt(2));
        System.out.println(s2.charAt(8));
        System.out.println(s3.charAt(5));
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
        System.out.println();
        System.out.println("codePointAt()");
        System.out.println(s.codePointAt(2));

        System.out.println();
        System.out.println("codePointCount() return the number of unicode values found in a string");
        System.out.println(s.codePointAt(2));

        System.out.println();
        System.out.println("codePointBefore()--> retyrn the unicode of the character before the specified index");
        System.out.println(s.codePointBefore(2));

        System.out.println();
        System.out.println("compareTo()");
        System.out.println("s.compareTo(s1 ) "+s.compareTo(s1));
        System.out.println("s.compareTo(s4) "+s.compareTo(s4));
        System.out.println("s2.compareTo(s3) "+s2.compareTo(s3));

        System.out.println();
        System.out.println("compareToIgnoreCase()");
        System.out.println("s.compareToIgnoreCase(s2) "+s.compareToIgnoreCase(s2));
        System.out.println("s.compareToIgnoreCase(s4) "+s.compareToIgnoreCase(s4));

        System.out.println();
        System.out.println("concat()");
        System.out.println(s.concat(s5));

        System.out.println();
        System.out.println("contains()");
        System.out.println("s.contains(\"l\") "+s.contains("o"));
        System.out.println("s.contains(\"w\") "+s.contains("w"));

        System.out.println();
        System.out.println("contentEquals()");
        System.out.println("s.contentEquals(s2) "+s.contentEquals(s2));
        System.out.println("s.contentEquals(s3) "+s.contentEquals(s3));
        System.out.println("s.contentEquals(s4) "+s.contentEquals(s4));
        System.out.println("s.contentEquals(s1) "+s.contentEquals(s1));
        System.out.println("s.contentEquals(s2) "+s2.contentEquals(s3));

        System.out.println();
        System.out.println("endsWith()");
        System.out.println("s.endsWith(\"o\") "+s.endsWith("o"));
        System.out.println("s.endsWith(\"g\") "+s.endsWith("g"));

        System.out.println();
        System.out.println("getBytes()");
        System.out.println("s.getBytes() "+s.getBytes());

        System.out.println();
        System.out.println(c);
        System.out.println("getChars()");
        s.getChars(2,4,c ,5);
        System.out.println(c);

        System.out.println();
        System.out.println("isEmpty()");
        System.out.println(s.isEmpty());

        System.out.println();
        System.out.println("join()");
        System.out.println(s.join("-","hello","java"));

        System.out.println();
        System.out.println("lastIndexOf()");
        System.out.println("s5.lastIndexOf(\"A\") : "+s5.lastIndexOf("A"));

        System.out.println();
        System.out.println("length()");
        System.out.println("s.length() : "+s.length());

        System.out.println();
        System.out.println("matches()");// doubt
        System.out.println("s.matches(s2) "+s2.matches(s));
        System.out.println("s.matches(s6) "+"Hello".matches(s6));//doubt
        System.out.println("s1.matches(s6) "+s1.matches(s6));
        System.out.println("s2.matches(s6) "+"JAVA".matches(s6));
        System.out.println("s3.matches(s6) "+s3.matches(s6));
        System.out.println("s4.matches(s6) "+"CODE".matches(s6));
        System.out.println("s5.matches(s6) "+s5.matches(s6));

        System.out.println();
        System.out.println("replace()");
        System.out.println("s.replace('H','C') "+s.replace('H','C'));

        System.out.println();
        System.out.println("replaceAll()");
        System.out.println("s5.replaceAll('A','B') "+s5.replace('A','B'));

//        System.out.println();
//        System.out.println("split()");
//        System.out.println("s5.split('A','B') "+s5.split(2,4));reg ex

        System.out.println();
        System.out.println("startsWith()");
        System.out.println("s5.startsWith(\"J\") "+s5.startsWith("J"));
        System.out.println("s5.startsWith(\"H\") "+s5.startsWith("H"));

        System.out.println();
        System.out.println("subString()");
        System.out.println("s3.substring(2,5) "+s3.substring(2,5));

        System.out.println();
        System.out.println("toLowerCase()");
        System.out.println("s5.toLowerCase() "+s5.toLowerCase());

        System.out.println();
        System.out.println("toUpperCase()");
        System.out.println("s1.toUpperCase() "+s1.toUpperCase());

        System.out.println();
        System.out.println("toString()");
        System.out.println("s2.toString() "+s2.toString());

        System.out.println();
        System.out.println("trim()");
        System.out.println("before trim() "+s7);
        System.out.println("after trim() "+s7.trim());

    }
}

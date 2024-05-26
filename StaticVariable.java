package JAVA_Practice;

public class StaticVariable {
    public static String name;
   // it's not mendatory to intialise the static variable,because they are automatically initialized to their default values.

    public int m1(){
      // int a;
       int c=0; 
 return c;
    } 
    public static void main(String[] args) {
        StaticVariable s = new StaticVariable();
        System.out.println(s.m1());
       System.out.println(StaticVariable.name="HELLO");
        
    }
}

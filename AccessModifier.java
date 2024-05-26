package JAVA_Practice;

class Parent3{
    public void m1(){
        System.out.println("THIS IS A PUBLIC METHOD IN ANOTHER CLASS !!");
    }
    // private void m2(){
    //     System.out.println("THIS IS A PRIVATE METHOD!!"); 
    // }
    protected void m3(){
        System.out.println("THIS IS A PROTECTED METHOD IN ANOTHER CLASS!!"); 
    }
    // default void m4(){
    //     System.out.println("THIS IS A default METHOD!!"); //default methods are only allowed in interfaces
    // }
}
 
public class AccessModifier {
   private void m5(){
        System.out.println("THIS IS A PRIVATE METHOD!!"); 
    }
    protected void m3(){
        System.out.println("THIS IS A PROTECTED METHOD!!"); 
    }
    public void m1(){
        System.out.println("THIS IS A PUBLIC METHOD!!");
    }
    public static void main(String[] args) {
        AccessModifier a = new AccessModifier();
        Parent3 p =new Parent3();
        a.m1();
        a.m3();
        a.m5();
        p.m1();
       // p.m2(); private method call within the class 
        p.m3();
       // p.m4();

    }
}

package JAVA_Practice;

class Parent1 {
    Parent1(){
        
        System.out.println("HELLO I'M Parent Class default constructor!!");
    }
    Parent1( int a, double b){
       this();
        System.out.println("HELLO I'M Parent Class 2 parameterized constructor!!");
    }
    Parent1(float a, char c, String s){ 
      this(89, 6.6);
        System.out.println("HELLO I'M Parent Class 3 parameterized constructor!!");
      }

}
class Child1 extends Parent1{
    Child1(){
        this(3, 5.5f);
        System.out.println("HELLO I'M Child Class default constructor!!"); 
    }
    Child1( int a, double b){  
        this(0.0f, 'a', "HIII");
        System.out.println("HELLO I'M child Class 2 parameterized constructor!!"); 
    }
    Child1(float a, char c, String s){
        super(4.4f, 'b', "HELLOO");
        System.out.println("HELLO I'M child Class 3 parameterized constructor!!");
        
    }
}
public class Constructor_Practice_1 {
    public static void main(String[] args) {
        System.out.println("START OF THE CONSTRUCTOR!! ");
        //Child1 c = new Child1();
        new Child1();
        System.out.println("END OF THE CONSTRUCTOR!!");
    }
}

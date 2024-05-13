package JAVA_Practice;

//package JAVA_Practice;

class Parent_1 {
    Parent_1(){
        
        System.out.println("HELLO I'M Parent Class default constructor!!");
    }
    Parent_1( int a, double b){
       
        System.out.println("HELLO I'M Parent Class 2 parameterized constructor!!");
    }
    Parent_1(float a, char c, String s){ //line3
      super();
        System.out.println("HELLO I'M Parent Class 3 parameterized constructor!!");
      }

}
class Child_1 extends Parent_1{
    Child_1(){
        super(5, 5.5);//super();
        System.out.println("HELLO I'M Child Class default constructor!!"); 
    }
    Child_1( int a, double b){  //line 2
        super(5.5f, 'a', "HELLO");//super(5, 5.5);
        System.out.println("HELLO I'M child Class 2 parameterized constructor!!"); //line 4
    }
    Child_1(float a, char c, String s){
        super(); // super(5.5f, 'a', "HELLO");
        System.out.println("HELLO I'M child Class 3 parameterized constructor!!");
        
    }
}
public class Constructor_Practice {
    public static void main(String[] args) {
        System.out.println("START OF THE CONSTRUCTOR!!");
        // Child_1 c = new Child_1(5, 5.5);   //line 1
        new Child_1(5, 5.5);
        System.out.println("END OF THE CONSTRUCTOR!!");
        
    }
    
}

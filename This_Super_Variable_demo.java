package JAVA_Practice;

class P1{
    int x =10;
    public void m1(){
        System.out.println("Parent method!!");
    }
}
class C1 extends P1{
    int x =20;
    public void m1(){
        System.out.println("Child method!!");
    }

    void show(){
        System.out.println("Value of super class variable: " +this.x);                          
        this.m1();
        System.out.println("Value of super class variable: "+super.x); 
         super.m1();                                                    // super class method call
    }
}
public class This_Super_Variable_demo {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.show();
        obj.m1();                             //here by default chid class method call
        
    }
}

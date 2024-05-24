package JAVA_Practice;             // Parent can keep child reference : Polymorphism

 class Parent2 {
    
    public void add(){
        System.out.println("Add method is running");
    }

    public void subtract(){
        System.out.println("Subtract method is running");
    }


}
 class Child2  extends Parent2{
    public void multiply(){
        System.out.println("multiply method is running");
    }

    public void divide(){
        System.out.println("divide method is running");
    }
}
public class ParentChildPolymorphism {
   
    public static void main(String[] args) {
    
            Parent2 p = new Parent2();
            p.add();
            p.subtract();
    
            Child2 c = new Child2();
            c.add();
            c.subtract();
            c.multiply();
            c.divide();
    
            Parent2 p1 = new Child2();//we can store the child class object with parent class reference
            p1.add();
            p1.subtract();
    
           // Child c1 = new Parent();
    
    
    }
}    
        
    
    
   
  


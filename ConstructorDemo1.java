package JAVA_Practice;

class Parent {
   
    Parent() {                                                    // Constructor of Parent class
        System.out.println("Parent constructor called");        //line 1    
    }
}

class Child extends Parent {
    
    Child() {                                                // Constructor of Child class
        super();                                            // Calling the constructor of the Parent class
        System.out.println("Child constructor called");    // line2
    }
}

public class ConstructorDemo1 {
    public static void main(String[] args) {
        
         new Child();                                     // Creating an object of Child class
    }
}



package JAVA_Practice;
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    public abstract void animalEat();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
abstract class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");/// If we don't implement all the methods of an abstract class in the child class,
        // we can make the child class abstract and inherit from it. In this way,
        // we can provide implementations for the remaining methods in another subclass.

    }
}
class Dog extends Pig {
    public void animalEat(){
        System.out.println("The dog eats: bone");
    };
}

public class Abstraction_2 {
    public static void main(String[] args) {
        //Pig myPig = new Pig(); // Create a Pig object
        //myPig.animalSound();
        //myPig.sleep();

        Dog myDog = new Dog() ; // Create a Dog object
        myDog.animalSound();
        myDog.sleep();
        myDog.animalEat();
    }
}

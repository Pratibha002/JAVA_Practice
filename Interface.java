package JAVA_Practice;
interface Animal1 {
    void animalSound(); // interface method (does not have a body)
    void sleep();
}

interface Animal2 {
    void animalSound1(); // interface method (does not have a body)
    void sleep1();
}


interface Cal1 {
    public void add(); // interface method (does not have a body)
    public void mul();
}

interface Cal2 {
    public void sub(); // interface method (does not have a body)
    public void div();
}

class Calculator implements Cal1,Cal2 {
    public void add() {
        System.out.println("Add kro");
    }
    public void mul(){
        System.out.println("Mul kro");
    };

    public void sub() {
        System.out.println("Sub kro");
    }
    public void div(){
        System.out.println("Div kro");
    };

}



class Pig1 implements Animal1,Animal2 {
    public void animalSound() {
        System.out.println("The pig animalSound");
    }
    public void sleep(){
        System.out.println("The pig sleep");
    };

    public void animalSound1() {
        System.out.println("The pig animalSound1");
    }
    public void sleep1(){
        System.out.println("The pig sleep1");
    };

}


public class Interface {//In Java, interfaces allow for multiple inheritance, but classes do not.
    public static void main(String[] args) {
        Pig1 myPig = new Pig1();
        myPig.animalSound();
        myPig.sleep();
        myPig.animalSound1();
        myPig.sleep1();


        Calculator cal = new Calculator();
        cal.add();
        cal.sub();
        cal.mul();
        cal.div();

    }
}

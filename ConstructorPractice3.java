package JAVA_Practice;

public class ConstructorPractice3 {
    public static void add(){//we can perform overloading in same class
        System.out.println("This is a default constructor!!");
    }
    public static int add(int a, int b){
        return a+b;
        
    }

    public static void main(String[] args) {
        add();
        System.out.println("a+b = "+add(2,5));
    }
}

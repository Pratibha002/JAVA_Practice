package JAVA_Practice;

class Polymorphism{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
class Overloaded extends Polymorphism{
    public int add (int a, int b, int c){
        return a+b+c;
    }
    public int mul(int a, int b, int c ){
        return a*b*c;
    }
}
class Overrided extends Polymorphism{
    public int div (int a, int b){
        
        int c = 1;
        return (a/b)*c;
    }
    public int mul(int a, int b){
        
        int c =6;

        return (a-b)-c;
    }
}

public class Polymorphism_Demo {
    public static void main(String[] args) {
        Overloaded o =new Overloaded();
        Overrided obj =new Overrided();
       System.out.println("ADDITION OF TWO NUMBERS: "+o.add(4, 05));
       System.out.println("SUBTRACTION OF TWO NUMBERS: "+o.sub(10,5));
       System.out.println("ADDITION OF THREE NUMBERS: "+o.add(2,3,4));
       System.out.println("ADDITION OF THREE NUMBERS: "+o.mul(2,6,9));
       System.out.println("MULTIPLE OPERATION ON THREE NUMBERS: "+obj.div(10, 5));
       System.out.println("SUBTRACTION OF THREE NUMBERS: "+obj.div(78, 65));
    }
}

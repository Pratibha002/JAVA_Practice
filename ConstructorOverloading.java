package JAVA_Practice;

public class ConstructorOverloading {
    int a;
    float b;
    ConstructorOverloading(){
        System.out.println("no argument constructor ");
    }
    ConstructorOverloading(int a){
        this.a=a;
        System.out.println("one argument constructor "+a);
    }
    ConstructorOverloading(int a, float b){
        this.a=a;
        this.b=b;
        System.out.println("two argument constructor "+a +", "+ b);
    }
    ConstructorOverloading( float b, int a){
        this.a=a;
        this.b=b;
        System.out.println("two argument constructor "+a +", "+ b);
    }

    public static void main(String[] args) {
        ConstructorOverloading c=new ConstructorOverloading();
        new ConstructorOverloading(10);
        new ConstructorOverloading(10,10.2f);
        new ConstructorOverloading(10.5f,10);
    }
}

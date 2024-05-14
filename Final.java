package JAVA_Practice;

final class A1{
    public void m1(){
        System.out.println("FINAL CLASS CAN'T BE INHERIT OR EXTEND!!");
    }
}

class A2{
    final public void m1(){
        System.out.println("THIS IS A 'FINAL' METHOD WHICH CAN'T BE OVERRODEN BY ANY OTHER MEHTOD!!");
    }
}
class A3 extends A2{
    // public void m1(){
    //     System.out.println("THIS IS A 'Normal' METHOD WHICH CAN BE OVERRODEN BY ANY OTHER MEHTOD!!");
    // }
    //but here we try to override the method which is not possible that's why complier give error.  
}
class A4{
    public void m2(){
        System.out.println("THIS IS A 'Normal' METHOD WHICH CAN BE OVERRODEN BY ANY OTHER MEHTOD!!");
    }
}
class A5 extends A4{                //this is a normal class which can be inherit and extend!!
    public void m2(){
        System.out.println("THIS IS A 'Normal' METHOD WHICH CAN BE OVERRODEN BY ANY OTHER MEHTOD!!");
    }
}


public class Final {
    public static void main(String[] args) {
        final double pi = 3.14;                  //now we cant change the value of variable pi
        System.out.println("VALUE OF PI = " +pi);
        // double pi = 334.34;                   we can't write like that it will give error
        // System.out.println("VALUE OF PI = " +pi);    
        
        A1 obj = new A1();
        obj.m1();
        A2 obj1 = new A2();
        obj1.m1();
        A4 obj2 = new A4();
        obj2.m2();

        
    }
}

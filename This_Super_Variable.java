package JAVA_Practice;

class P{
    String s ="PARENT VARIABLE!!";
}
class C extends P{
    String s ="CHILD VARIABLE!!";
    public void show(){
        System.out.println(s);                          //by default current class variable call
        System.out.println(this.s);                     //explicitly say call current class variable 
        System.out.println(super.s);                    //explicitly say call super/ parent  class variable

    } 
}
public class This_Super_Variable {
    public static void main(String[] args) {
        C obj = new C();
        obj.show(); 
    }
    
}

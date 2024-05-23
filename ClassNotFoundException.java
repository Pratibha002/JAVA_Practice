package JAVA_Practice;

class Class1{
    public void m1(){
        System.out.println("HELLO!!");
    }
}
public class ClassNotFoundException {
    public static void main(String[] args) {
        try{ 
            Class.forName("JAVA_Practice.Class1");   
            //Class.forName("Class1"), Java expects the fully qualified name of the class, which includes the package name if the class is in a package.
            
            System.out.println("Class found successfully");
            Class.forName("Class1");// class not found and throw the exception
            // if class1 is not present there it also give this error as well.
        } 
        catch(Exception e){ 
            System.out.println(e); 
            System.out.println("Class Not Found..."); 
        } 
        Class1 c = new Class1();
        c.m1();
        System.out.println("BYE!!");
        
    }
}

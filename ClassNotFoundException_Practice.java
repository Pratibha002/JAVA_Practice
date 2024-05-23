package JAVA_Practice;

public class ClassNotFoundException_Practice {
    public static void main(String[] args) {
        try{ 
           
            Class.forName("Class1");// class not found and throw the exception
            
        } 
        catch(Exception e){ 
            System.out.println(e); 
            System.out.println("Class Not Found..."); 
        } 
            System.out.println("BYE!!");
    }
}


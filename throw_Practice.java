package JAVA_Practice;

public class throw_Practice {
    public static void main(String[] args) {
        m1();
        System.out.println("----------------------------------------------------");
        m2();
    }
    public static void m1(){
        try{
        System.out.println("Statement 1");
        int a=0;
        int b=2/a;
        System.out.println("Statement 2");
        }catch(Exception e){
            System.out.println("Statement 3");
        }
        finally{
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
    public static void m2(){
        try{
        System.out.println("Statement 1");
        int a=0;
        int b=2/a;
        System.out.println("Statement 2");
        }catch(Exception e){              
            throw e; //whenver we use the throw keyword in catch block program execution will get stop.
        }
        finally{
            System.out.println("Statement 4"); 
        }
        System.out.println("Statement 5");  //this line won't print
        }
            
    
    
}



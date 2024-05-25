package JAVA_Practice;

public class Throw_Practice2 {
    public static void main(String[] args) {
        System.out.println("WLCOME!!");
        String s =null;
        try{
            System.out.println("Statement 1");
             System.out.println(s.length());
             System.out.println("Statement 3"); 
        }catch(Exception e){
            throw e;                  //whenever we use the throw keyword in catch block program execution will get stop.
        }finally{
            System.out.println("Statement 4");
            System.out.println("Statement 5");
            System.out.println("Statement 6");
            System.out.println("Statement 7");
            System.out.println("Statement 8, THE END :)");
        
        }
        System.out.println("THE END!!");
    }
}

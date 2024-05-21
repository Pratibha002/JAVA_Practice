package JAVA_Practice;

public class try_catch {
    public static void main(String[] args) {
        try{
            System.out.println("try 1");
            System.out.println("try 2");
            char c = 0;
            int a=4/c;                                //risky code
            System.out.println("try 3");
            System.out.println("try 4");

        }catch(Exception exception){
            System.out.println("catch 1" );            //handling code
            System.out.println("catch 2");

            

        }finally{ //this block must be execute/run
            System.out.println("final 1");
            System.out.println("final 1");
        }
    }
}

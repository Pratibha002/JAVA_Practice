package JAVA_Practice;

public class tryCatchWithReturnStatement {
    public static void main(String[] args) {
        tryCatchWithReturnStatement t =new tryCatchWithReturnStatement();
        int result=t.m1();
        System.out.println(result);
    }
    public int m1(){
        try{
            System.out.println("try block ");
            int a=0;
            int b=2/a;
            return b;
        }catch (Exception e){
            System.out.println("catch block!!!");
            return 0;
        }finally {
            System.out.println("Finally block!!!");
        }

    }
}

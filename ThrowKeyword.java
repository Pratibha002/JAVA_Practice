package JAVA_Practice;

public class ThrowKeyword {
    public static void main(String[] args) {
        int a =20;
       // int a =0;
        int b=0;
       
        try{
            b=18/a;                      //when bigger no. is divided by smaller no. it give o/p zero(0) but we don't want that so...
            if(b==0){
                throw new Exception("I Don't want to print zero");   //here we explicitly generate the exception 
            }                            
        }catch(Exception e){
             b = 18/1;                 // here we are handeling if anyone divide by 0 or bigger num you give o/p 18
            System.out.println("that's the default output" +e);
        }
        System.out.println(b);
        System.out.println("execution completed!!");
    }
}

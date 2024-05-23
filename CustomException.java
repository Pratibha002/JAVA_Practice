package JAVA_Practice;

class PratibhaException extends Exception{ //we can customize the exception, we can give the name by own by creating that exception class
   public PratibhaException(String s){
    super(s);                             //in the constructor i passed the message that's why i called this otherwise we don't need it.
   }                                        //we extend the 'Exception' because it is a parent class so we can access all the features of exception class or else we have to built
}
public class CustomException {
    public static void main(String[] args) {
        int a =20;
        // int a =0;
         int b=0;
        
         try{
             b=18/a;                      //when bigger no. is divided by smaller no. it give o/p zero(0) but we don't want that so...
             if(b==0){
                 throw new PratibhaException("don't want zero when divide with greater number");//here i pass the constructor and pass some comment as well   //here we explicitly generate the exception 
             }                            
         }catch(PratibhaException e){
              b = 18/1;                 // here we are handeling if anyone divide by 0 or bigger num you give o/p 18
             System.out.println("that's the default output" +e);
         }
         System.out.println(b);
         System.out.println("execution completed!!");
    }
}

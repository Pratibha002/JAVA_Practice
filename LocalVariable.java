package JAVA_Practice;

public class LocalVariable {
   
     
        public static void main(String [] args){
           m1(2,4);
           //System.out.println(c);     error:cannot find symbol 
           //out of scope
           int num;// local variable must be initalized, either it will generate an error.
           num = 10; // Initializing the local variable
           System.out.println("Value of num: " + num); 
        }
        public static int m1(int a, int b){
            int c;
            c=a+b;
            System.out.println(c); 
            return c;
           
          
        }
        // System.out.println(c); //out of scope, errro: cannot find symbol 
        
    }
    


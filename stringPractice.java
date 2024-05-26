package JAVA_Practice;

public class stringPractice {
    public static void main(String[] args) {
        int a =10;
        int c =30;
        c=a+10;
        System.out.println(c);          //VALUE OF C =20
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("STRING LITERAL"); 
        String s ="Pratibha";
        System.out.println("original value of s = "+s); 

        String s1=s;                   //s1 value = "Pratibha"
        System.out.println("s1 = "+s1); 
        System.out.println("now we compare the references s1==s : " +s1==s);
        System.out.println("now we compare the objects s1.equals(s) : " +s1.equals(s)); //for string '.equals()' method do content comparison

        s.concat("Chouhan");//The concat method does not change the original string s because strings are immutable
        System.out.println("after concatenation = "+s);
        System.out.println("now we compare the references s1==s : " +s1==s);
        System.out.println("now we compare the objects s1.equals(s) : " +s1.equals(s));

        s="Aman bhaiya"; //now s is pointing to the object Aman bhaiya, Reassigning s to "Aman bhaiya" makes 
        //s reference a new string object, demonstrating how variables can point to different objects after reassignment.

        System.out.println("after reassigning, the value of s = "+s);        //VALUE OF S = Aman bhaiya
        System.out.println("now we compare the references s1==s : "  +s1==s);
        System.out.println("now we compare the object s1.equals(s) : " +s1.equals(s));

        System.out.println("------------------------------------------------------------------------------"); 

        System.out.println("NEW KEYWORD"); 
        String s2 = new String("Pratibha");
        System.out.println(s2);
        System.out.println("now we compare the references s2==s  : " +s2==s);
        System.out.println("now we compare the object s2.equals(s) : "  +s2.equals(s)); 
        s2.concat("chouhan");
        System.out.println(s2);
        System.out.println("now we compare the references s2==s2 : " +s2==s2);
        System.out.println("now we compare the object s2.equals(s2) : " +s2.equals(s2));

        s2="Chouhan";
        System.out.println(s2);
        System.out.println("now we compare the references s2==s2 : " +s2==s2);
        System.out.println("now we compare the object s2.equals(s2) : " +s2.equals(s2));
        
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("StringBuffer"); 
        StringBuffer s3 =new StringBuffer("Pratibha");
        System.out.println(s3);
        System.out.println("now we compare the references s3==s  :" +s3==s);
        System.out.println("now we compare the object s3.equals(s) : " +s3.equals(s)); //for StringBiffer .equals()method act as a '==' operator i.e, it compare the reference not object
        System.out.println("now we compare the references s3==s2: " +s3==s2);
        System.out.println("now we compare the object s3.equals(s2) : " +s3.equals(s2));
        System.out.println("now we compare the references s3==s1: " +s3==s1);
        System.out.println("now we compare the object s3.equals(s1): " +s3.equals(s1));

        s3.append("chouhan");
        System.out.println(s3); 

       
      //  System.out.println(s);


    }

}

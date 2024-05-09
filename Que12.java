package JAVA_Practice;

public class Que12 {
    public static void main(String[] args) {
        String s ="IndiaIsaGreatCountry";
        
        int count=0;
        for(int i=0; i<s.length(); i++){
           
            if(s.charAt(i)=='a'){
               
               count++;
               
            }
             
        }
        System.out.println("total number of a = " +count);
    }
}

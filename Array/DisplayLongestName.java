package JAVA_Practice.Array;

public class DisplayLongestName {
    public static void main(String[] args) {
        String [] s ={"Hello", "World", "HelloWorld", "HelloJava"};
        int maxLength=0;
        String longestName ="";
        for(String i : s){
            if(i.length()>maxLength){
                longestName=i;
                maxLength=i.length();
            }
        }System.out.println("First Longest Name : "+longestName);
    }
}

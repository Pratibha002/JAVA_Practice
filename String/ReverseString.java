package JAVA_Practice.String;

public class ReverseString {
    public static void main(String[] args) {
        String s ="hello world";
        System.out.println("original string : "+s);

        System.out.println("Modified  string : ");
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}

package JAVA_Practice.String;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String s = "HELLO PAVA";
        System.out.println("Original String : "+s);
        StringBuffer sb =new StringBuffer(s);
        int index =6;
        sb.setCharAt(index,'J');
        String newString =sb.toString();
        System.out.println("Modified String : "+ newString);
    }
}

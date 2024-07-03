//Remove Leading Zeros From String in Java
package JAVA_Practice.String;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String s =" 00000123569";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='0'){
                System.out.print(s.charAt(i));
            }
        }
    }
}

//Remove all characters except the numeric characters from an alphanumeric string
package JAVA_Practice.String;

public class RemoveCharacters {
    public static void main(String[] args) {
        String s = "AA1d23cBB4";
        for(int i=0; i<s.length(); i++){
            if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))){
                System.out.print("AFTER REMOVING CHARACTERS : "+s.charAt(i)+"");
            }
        }
    }
}

package JAVA_Practice.String;

public class RemoveVowels {
    public static void main(String[] args) {
        String s= "what is your name ?";
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'){
                System.out.print(s.charAt(i));
            }
        }
    }
}

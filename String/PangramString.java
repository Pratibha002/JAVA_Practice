package JAVA_Practice.String;

public class PangramString {
    public static void main(String[] args) {
        String s ="abcdefghijklmnopqrstuvwxyz".toLowerCase();
        boolean [] b =new boolean[26];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                int index = s.charAt(i)-'a';
                b[index]=true;
            }
        }boolean isPangram=true;
        for(boolean present:b){
            if(!present){
                isPangram=false;
                break;
            }
        }if(isPangram){
            System.out.println("Yes, it is a pangram!!");
        }else{
            System.out.println("no, it is not a pangram!!");
        }
    }
}

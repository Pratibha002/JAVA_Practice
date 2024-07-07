package JAVA_Practice.String;

public class checkCharacters {
    public static void main(String[] args) {
        String s = "hello";
        boolean isSame=false;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(0);
            if(s.charAt(i)==c){
               isSame=true;
            } else{
                isSame=false;
            }
        }if(isSame){
            System.out.println("ALl the characters are same  ");
        }else{
            System.out.println("ALl the characters are different  ");
        }
    }
}

package JAVA_Practice.String;

public class ReverseEverySecondWord {
    public static void main(String[] args) {
        String str ="hello my name is Pratibha Chauhan how are you";
        //task is to reverse every 2nd string
        String [] words =  str.split(" ");
        StringBuilder result= new StringBuilder();

        for(int i=0; i<words.length; i++){
            if(i%2!=0){
                String revWord = new StringBuilder(words[i]).reverse().toString();
                result.append(revWord).append(" ");
            }
            else {
                result.append(words[i]).append(" ");
            }
        }
        System.out.println("Modified sentence: " + result.toString());
    }
}

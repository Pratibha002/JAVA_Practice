//Given a list of characters, merge all of them into a string.
package JAVA_Practice.Basic_Programming;

public class CharacterToString {
    public static void main(String[] args) {
        char [] arr ={'h', 'e', 'l', 'l', 'o', 'J', 'a', 'v', 'a'};
        StringBuilder sb =new StringBuilder();
        for(int i=0; i< arr.length;i++){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}

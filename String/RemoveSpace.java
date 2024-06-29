package JAVA_Practice.String;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "Hello World Hello Java";
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if(c!=' '){
                sb.append(c);
            }

        }
        System.out.println(sb);
    }
}

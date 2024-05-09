package JAVA_Practice;

public class Que3 {
    public static void main(String[] args) {
        String s = "IndiaIsGreat";
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'I' || s.charAt(j) == 'i') {
                continue;
            }
            System.out.println(s.charAt(j));

        }
    }
}

package JAVA_Practice;

public class Que3 {
    public static void main(String[] args) {
        String S = "IndiaIsGreat";
        for (int j = 0; j < S.length(); j++) {
            if (S.charAt(j) == 'I' || S.charAt(j) == 'i') {
                continue;
            }
            System.out.println(S.charAt(j));

        }
    }
}

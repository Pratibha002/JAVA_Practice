package JAVA_Practice;

public class Que12 {
    public static void main(String[] args) {
        String S = "IndiaIsaGreatCountry";

        int count = 0;
        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == 'a') {

                count++;

            }

        }
        System.out.println("total number of a = " + count);
    }
}

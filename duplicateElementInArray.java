package JAVA_Practice;

public class duplicateElementInArray {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 4, 35, 67, 65, 1, 1, 9, 3 };
        for (int i = 0; i < a.length; i++) {

            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {

                System.out.println("UNIQUE NUMBER!!" + a[i]);
            }
        }
    }
}

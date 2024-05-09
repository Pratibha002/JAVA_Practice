package JAVA_Practice;

public class Que9 {
    public static void main(String[] args) {
        int sum = 11;
        for (int row = 4; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                sum = sum - 1;
                System.out.print(sum + " ");

            }
            System.out.println("  ");

        }

    }
}

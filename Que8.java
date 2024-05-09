package JAVA_Practice;

public class Que8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= row; column++) {
                sum = sum + 1;
                System.out.print(sum + " ");

            }
            System.out.println("  ");

        }

    }

}

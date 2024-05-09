package JAVA_Practice;

public class Que16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) { // divisible by 3
                System.out.println(i + " = FIZZ");
            }
            if ((i % 3 == 0) && (i % 5 == 0)) { // divisible by both 3 and 5
                System.out.println(i + " = FizzBuzz");
            }
            if (i % 5 == 0) {// divisible by 5
                System.out.println(i + " = Buzz");
            }
        }
    }
}

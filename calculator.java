package JAVA_Practice;

// inheritance
class Calc {
    public int add(int num1, int num2) {
        return num1 + num2;

    }

    public int sub(int num1, int num2) {
        return num1 - num2;

    }

}

class AdvCalc extends Calc {
    public int mul(int num1, int num2) {
        return num1 * num2;

    }

    public int div(int num1, int num2) {
        return num1 / num2;

    }

    public int modulus(int num1, int num2) {
        return num1 % num2;

    }

}

public class calculator {
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc();
        int r1 = c.add(2, 4);
        int r2 = c.sub(4, 2);
        int r3 = c.mul(2, 4);
        int r4 = c.div(4, 2);
        int r5 = c.modulus(9, 2);
        System.out.println("num1 + num2 = " + r1);
        System.out.println("num1 - num2 = " + r2);
        System.out.println("num1 * num2 = " + r3);
        System.out.println("num1 / num2 = " + r4);
        System.out.println("num1 % num2 = " + r5);

    }
}

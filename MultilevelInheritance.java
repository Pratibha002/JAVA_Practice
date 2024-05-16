package JAVA_Practice;

import java.util.Scanner;

class Addition {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class Subtraction extends Addition {
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class Multiplication extends Subtraction {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }
}

class Division extends Multiplication {
    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Division d = new Division();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N1 AND N2 ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("n1+n2 = " + d.add(num1, num2));
        System.out.println("ENTER THE VALUE OF N1 AND N2 ");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("n1-n2 = " + d.sub(num3, num4));
        System.out.println("ENTER THE VALUE OF N1 AND N2 ");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        System.out.println("n1*n2 = " + d.add(num5, num6));
        System.out.println("ENTER THE VALUE OF N1 AND N2 ");
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        System.out.println("n1/n2 = " + d.add(num7, num8));
        sc.close();

    }
}

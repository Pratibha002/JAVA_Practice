package JAVA_Practice;

public class ArithmeticException {
    public static void main(String[] args) {
        int a=0;
        int b=4;
        int c = b/a;             //wrong arithmetic operation
        System.out.println(c);

        System.out.println("THIS LINE WILL NOT EXECUTE BECAUSE RUNTIME ERROR OCUUR AT LNE NO. 7!!");

    }
}

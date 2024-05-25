package JAVA_Practice;

public class InstanceVariable {
    public String name;
    public  String m1(){
        //  int a;
        //  int c=0;
         name = "hello";
        // return c;
         return name;

    }
    public static void main(String[] args) {
        InstanceVariable i =new InstanceVariable();
        System.out.println(i.m1());
        System.out.println(i.name="Pratibha");

    }
}

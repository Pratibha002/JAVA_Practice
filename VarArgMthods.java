//we csn declare a method which can take variable number of arguments such type of methods are called var-arg methods
package JAVA_Practice;

public class VarArgMthods {
     static void sum(int... x){
        int total=0;
        for(int i:x){
            total=total+i;
        }System.out.println(total);
    }
    public static void main(String[] args){
        sum();
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
    }
}

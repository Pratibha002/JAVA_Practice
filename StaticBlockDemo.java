package JAVA_Practice;

public class StaticBlockDemo {

    static {
        System.out.println("Static Block!");
    }
//after 1.6 version we require the main method to run the static block
//before 1.6 or in 1.6 version we can directly run the static block without main method, but ' System.exit(0);'
//is required to stop the jvm then the static block run perfectly.
    /*
     static {
        System.out.println("Static Block!");
        System.exit(0);
    }
     */
  //IMPORTANT POINT ABOUT STATIC BLOCK
  /*
  ==>Static block call automatically, there is no requirement of any object, new keyword or reference to call it.
   */
    public static void main(String[] args) {
        System.out.println("I'm in main method");

    }
}

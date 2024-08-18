package JAVA_Practice;

public class StaticBlockDemo {

    static int a;
    static {
        a=10;
        System.out.println("Static variable: "+a);
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
  ==>Static block call automatically, when class is loaded
  there is no requirement of any object, new keyword or reference to call it.
  ==> we can create multiple static block in a single class, the execution of that static block would be
  sequential means phle jo static block or varible ayenge phle  wo print honge static methods print hongi than constructor, than methods
  and other things of code
  ==>Static block flow is top to bottom

  ==>WHY WE USE THE STATIC BLOCK??
  ANS: 1)STATIC BLOCK IS EXECUTED AT CLASS LOADING, HENCE AT THE TIME OF CLASS LOADING IF WE WANT TO PERFORM
  ANY ACTIVITY, WE HAVE TO DEFINE THAT INSIDE STATIC BLOCK E.G "NATIVE METHODS".
  ==>"native methods"?--> methods which are written in another language, jiska code kisi or lang me likha hua ho
  2) STATIC BLOCK IS USED TO INITIALIZE THE STATIC MEMBERS
   */

    public static void main(String[] args) {
        System.out.println("I'm in main method");

    }
    static {
        System.out.println("Second Static Block!");
    }
}

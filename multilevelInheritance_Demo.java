package JAVA_Practice;

class AmanBhaiya{
    public boolean enrollmentClass(){
        //new student enrollment
        return true;
    }
}
class Pratibha extends AmanBhaiya{
    public void javaScript(){

    }
}
class AnuragBhaiya extends Pratibha{
    public void java(){

    }
}
class Ruchi extends AnuragBhaiya{
    public void htmlCss(){

    }
}
    

public class multilevelInheritance_Demo{
    public static void main(String[] args) {
       Ruchi r = new Ruchi();
       r.htmlCss();
       r.java();
       r.javaScript();
       r.enrollmentClass(); 
    }
}

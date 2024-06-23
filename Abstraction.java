package JAVA_Practice;

import java.security.PublicKey;

abstract class Vehicle{
    public abstract  int getNoOfWheels();
}
class Bus extends Vehicle{
    @Override
    public int getNoOfWheels() {
        return 6;
    }
}
class Auto extends Vehicle{
    @Override
    public int getNoOfWheels() {
        return 3;
    }
}
public class Abstraction {
    public static void main(String[] args){
        Bus b =new Bus();
        System.out.println("Number of wheels in a Bus = "+b.getNoOfWheels());
        Auto a =new Auto();
        System.out.println("Number of wheels in a Auto = "+a.getNoOfWheels());
    }
}

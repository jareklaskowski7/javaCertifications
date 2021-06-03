//	Sun Certified Java Programmer
//	Chapter 1, P43
//  Declarations and Access Control

public abstract class Vehicle {
    private String type;

    public abstract void goUpHill();    //  Abstract method

    public String getType() {           //  Non-abstract method
        return type;
    }
}

//	Sun Certified Java Programmer
//	Chapter 1, P64
//  Declarations and Access Control

public enum CoffeeSize {
    //  8, 10 & 16 are passed to the constructor
    BIG(8), HUGE(10), OVERWHELMING(16);

    CoffeeSize(int ounces) { // constructor
        this.ounces = ounces;
    }

    private int ounces; // an instance variable

    public int getOunces() {
        return ounces;
    }
}

//	Sun Certified Java Programmer
//	Chapter 1, P61_2
//  Declarations and Access Control

public class CoffeeTest2 {
    public static void main(String[] args) {
        Coffee2 drink = new Coffee2();
        drink.size = Coffee2.CoffeeSize.BIG; // enclosing class name required
    }
}

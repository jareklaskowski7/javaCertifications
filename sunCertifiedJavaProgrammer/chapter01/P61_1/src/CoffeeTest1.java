//	Sun Certified Java Programmer
//	Chapter 1, P61_1
//  Declarations and Access Control

public class CoffeeTest1 {
    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG; // enum outside class
    }
}

//	Sun Certified Java Programmer
//	Chapter 1, P62_1
//  Declarations and Access Control

public class CoffeeTest1 {
    public static void main(String[] args) {
        enum CoffeeSize {BIG, HUGE, OVERWHELMING} // WRONG! Cannot declare enums in methods
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
    }
}

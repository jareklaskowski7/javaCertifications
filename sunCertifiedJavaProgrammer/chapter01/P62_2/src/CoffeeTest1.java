//	Sun Certified Java Programmer
//	Chapter 1, P62_2
//  Declarations and Access Control

public class CoffeeTest1 {
    enum CoffeeSize {BIG, HUGE, OVERWHELMING}

    //;
    // <--semicolon is optional here

    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
    }
}

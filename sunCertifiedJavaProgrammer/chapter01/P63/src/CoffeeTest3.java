//	Sun Certified Java Programmer
//	Chapter 1, P63
//  Declarations and Access Control

public class CoffeeTest3 {
    enum CoffeeSize {BIG, HUGE, OVERWHELMING}
    public static void main(String[] args) {
        for (CoffeeSize cs : CoffeeSize.values())
            System.out.println(cs);
    }
}

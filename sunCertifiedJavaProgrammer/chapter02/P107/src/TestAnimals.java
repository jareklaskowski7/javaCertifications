//	Sun Certified Java Programmer
//	Chapter 2, P107
//  Object Orientation

public class TestAnimals {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();    //  Not legal because Horse didn't inherit eat()
    }
}

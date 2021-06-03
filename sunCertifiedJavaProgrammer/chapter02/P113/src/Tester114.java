//	Sun Certified Java Programmer
//	Chapter 2, P113
//  Object Orientation

public class Tester114 {
    public static void main(String[] args) {
        // Examples of illegal Overrides
        Animal a = new Animal();
        a.eat();

        Horse h = new Horse();
        h.eat();

        Animal ah = new Horse();
        ah.eat();

        Horse he = new Horse();
        he.eat("Apples");

        Animal a2 = new Animal();
        a2.eat("treats");

        Animal ah2 = new Horse();
        ah2.eat("Carrots");
    }
}

//	Sun Certified Java Programmer
//	Chapter 2, P113
//  Object Orientation

public class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eating hay ");
    }

    public void eat(String s) {
        System.out.println("Horse eating " + s);
    }
}

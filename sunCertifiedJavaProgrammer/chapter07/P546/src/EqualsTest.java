//	Sun Certified Java Programmer
//	Chapter 7, P546
//  Generics and Collections

public class EqualsTest {
    public static void main(String[] args) {
        Moof one = new Moof(8);
        Moof two = new Moof(8);
        if (one.equals(two)) {
            System.out.println("one and two are equal");
        }
    }
}

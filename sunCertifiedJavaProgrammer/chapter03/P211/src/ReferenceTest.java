//	Sun Certified Java Programmer
//	Chapter 3, P211
//  Assignments

import java.awt.Dimension;

class ReferenceTest {
    public static void main(String[] args) {
        Dimension a = new Dimension(5, 10);
        System.out.println("a.height = " + a.height);
        Dimension b = a;
        b.height = 30;
        System.out.println("a.height = " + a.height +
                " after change to b");
        a.height = 40;
        System.out.println("b.height = " + b.height +
                " after change to a");
        b.height = 50;
        System.out.println("a.height = " + a.height +
                " after change to b");
    }
}

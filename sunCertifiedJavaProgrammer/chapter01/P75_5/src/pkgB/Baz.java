//	Sun Certified Java Programmer
//	Chapter 1, P75_5
//  Declarations and Access Control

package pkgB;

import pkgA.*;

public class Baz {
    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.print(" " + f.a);
        System.out.print(" " + f.b);
        System.out.println(" " + f.c);
    }
}

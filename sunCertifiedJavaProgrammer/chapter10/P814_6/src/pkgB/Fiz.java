//  Sun Certified Java Programmer
//	Chapter 10; P814_6
//  Development

package pkgB;

import pkgA.*;

public class Fiz extends Foo {
    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.print(" " + f.a);
        System.out.print(" " + f.b);
        System.out.print(" " + new Fiz().a);
        System.out.print(" " + new Fiz().b);
    }
}

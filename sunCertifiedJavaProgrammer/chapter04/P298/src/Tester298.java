//	Sun Certified Java Programmer
//	Chapter 4, P298
//  Operators

class Tester298 {
    public static void main(String[] args) {
        Bar a = new Bar();
        Bar b = new Foo();
        Foo c = new Foo();
        Face d = new Bar();
        Face e = new Foo();

        a = null;
        b = null;
        c = null;
        d = null;
        e = null;

        if (a instanceof Bar) {
            System.out.println("a = " + a instanceof Bar);
        }
        if (a instanceof Foo) {
            System.out.println("a instanceof Foo");
        }
        if (a instanceof Face) {
            System.out.println("a instanceof Face");
        }
        if (a instanceof Bar) {
            System.out.println("a instanceof Bar");
        }
        (a instanceof Foo) &
                (a instanceof Face) &
                (a instanceof Object))
        System.out.println("a = " + a instanceof Object);
        else System.out.println("a failed");
        if ((b instanceof Bar) &
                (b instanceof Foo) &
                (b instanceof Face) &
                (b instanceof Object))
            System.out.println("b = " + b instanceof Object);
        else System.out.println("b failed");
        if ((c instanceof Bar) &
                (c instanceof Foo) &
                (c instanceof Face) &
                (c instanceof Object))
            System.out.println("c = " + c instanceof Object);
        else System.out.println("c failed");
        if ((d instanceof Bar) &
                (d instanceof Foo) &
                (d instanceof Face) &
                (d instanceof Object))
            System.out.println("d = " + d instanceof Object);
        else System.out.println("d failed");
        if ((e instanceof Bar) &
                (e instanceof Foo) &
                (e instanceof Face) &
                (e instanceof Object))
            System.out.println("e = " + e instanceof Object);
        else System.out.println("e failed");
    }
}

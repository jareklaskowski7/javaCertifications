//	Sun Certified Java Programmer
//	Chapter 2, P125
//  Object Orientation

public class Tester125 {
    public static void main(String[] args) {
        class Foo {
        }   //  OK
        class Bar implements Foo {
        }    //  No! Can't implement a class
        interface Baz {
        }   //  OK
        interface Fi {
        }    //  OK
        interface Fee implements Baz {
        }    //  No! Interface can't implement
        //  an interface
        interface Zee implements Foo {
        }    //  No! Interface can't implement
        //  a class
        interface Zoo extends Foo {
        }   //  No! Interface can't extend a class
        interface Boo extends Fi {
        }    //  OK. Interface can extend an interface
        class Toon extends Foo, Button {
        }  //  No! Classs can't extend multiple
        //  classes
        class Zoom implements Fi, Baz {
        }   //  OK. class can implement multiple
        //  interfaces
        interface Vroom extends Fi, Baz {
        } //  OK. interface can extend multiple
        //  interfaces
        class Yow extends Foo implements Fi {
        } //  OK. Class can do both
        //  (extends must be 1st)
    }
}

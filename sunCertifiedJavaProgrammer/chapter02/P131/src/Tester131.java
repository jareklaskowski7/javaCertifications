//	Sun Certified Java Programmer
//	Chapter 2, P131
//  Object Orientation

public class Tester131 {
    public static void main(String[] args) {
        //  P131
        Foo f = new Foo();              //  Won't compile, no matching constructor
        //  P132
        Foo f2 = new Foo("Fred", 43);    //  No problem.  Arguments match
        //  the Foo constructor.}
    }
}

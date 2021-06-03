//	Sun Certified Java Programmer
//	Chapter 3, P199
//  Assignments

class Test {
    public static void main(String[] args) {
        Foo reallyABar = new Bar();     //  Legal because Bar is a
        //  subclass of Foo
        Bar reallyAFoo = new Foo();     //  Illegal!  Foo is not a
        //  subclass of Bar
    }
}

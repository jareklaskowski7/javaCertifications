//	Sun Certified Java Programmer
//	Chapter 4, P296_2
//  Operators

class Tester296_2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        if (a instanceof Foo) {
            System.out.println("a instanceof Foo");
        }
        if (b instanceof A) ;
        {
            System.out.println("b instanceof A");
        }
        if (b instanceof Foo) ;      //  implemented indirectly
        {
            System.out.println("b instanceof Foo");
        }
    }
}

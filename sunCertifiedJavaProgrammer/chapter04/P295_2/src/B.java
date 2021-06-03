//	Sun Certified Java Programmer
//	Chapter 4, P295_2
//  Operators

class B extends A {
    public static void main(String[] args) {
        A myA = new B();
        m2(myA);
        A myA2 = new A();
        m2(myA2);
    }

    public static void m2(A a) {
        if (a instanceof B)
            ((B) a).doBStuff();       //  downcasting an A reference
        //  to a B reference
        if (a instanceof A)
            doAStuff();
    }

    public static void doBStuff() {
        System.out.println("'a' refers to a B");
        System.out.println("1");
    }

    public static void doAStuff() {
        System.out.println("'a' refers to an A");
        System.out.println("2");
    }
}

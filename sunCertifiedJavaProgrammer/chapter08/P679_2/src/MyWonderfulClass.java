//	Sun Certified Java Programmer
//	Chapter 8; P679_2
//  Inner Classes

class MyWonderfulClass {
    void go() {
        Bar b = new Bar();
        b.doStuff(new Foo() {
            public void foof() {
                System.out.println("foofy");
            }   //  end foof method
        });   //  end inner class def, arg, and b.doStuff stmt.
    }   //  end go()
}   //  end class

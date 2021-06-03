//	Sun Certified Java Programmer
//	Chapter 8; P679_1
//  Inner Classes

class MyWonderfulClass {
    void go() {
        Bar b = new Bar();
        b.doStuff(ackWeDoNotHaveAFoo!);     //  Don't try to compile this at home
    }
}

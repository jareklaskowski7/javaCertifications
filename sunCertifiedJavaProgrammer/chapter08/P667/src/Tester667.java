//	Sun Certified Java Programmer
//	Chapter 8; P667
//  Inner Classes

public class Tester667 {
    public static void main(String[] args) {
        MyOuter mo = new MyOuter();     //  gotta get an instance!
        MyOuter.MyInner inner = mo.new MyInner();
        inner.seeOuter();

        //MyOuter.MyInner inner = new MyOuter().new MyInner();
        //inner.seeOuter();
    }
}

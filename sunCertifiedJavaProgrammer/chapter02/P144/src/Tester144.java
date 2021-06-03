//	Sun Certified Java Programmer
//	Chapter 2, P144
//  Object Orientation

public class Tester144 {
    public void go() {
        doStuff();
    }

    public void doStuff() {
        go();
    }

    public static void main(String[] args) {
        Tester144 t = new Tester144();
        t.go();
    }
}

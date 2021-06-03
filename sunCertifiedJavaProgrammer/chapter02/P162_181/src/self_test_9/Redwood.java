//	Sun Certified Java Programmer
//	Chapter 2, P166
package self_test_9;

public class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }
    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(), new Redwood());
    }
    void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood)t1;
        Tree t2 = (Tree)r1;
    }
}
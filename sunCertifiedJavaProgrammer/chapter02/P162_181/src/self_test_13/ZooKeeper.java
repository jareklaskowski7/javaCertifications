//	Sun Certified Java Programmer
//	Chapter 2, P168
package self_test_13;

public class ZooKeeper {
    public static void main(String[] args) { new ZooKeeper().go(); }
    void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}
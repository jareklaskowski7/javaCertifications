//	Sun Certified Java Programmer
//	Chapter 9; P709
//  Threads

public class TestThreads {
    public static void main(String[] args) {
        FooRunnable r = new FooRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}

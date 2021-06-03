//	Sun Certified Java Programmer
//	Chapter 9; P710_711
//  Threads

public class NameThread {
    public static void main(String[] args) {
        NameRunnable nr = new NameRunnable();
        Thread t = new Thread(nr);
        //t.setName("Fred");
        t.start();
    }
}

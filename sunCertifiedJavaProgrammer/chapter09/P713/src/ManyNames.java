//	Sun Certified Java Programmer
//	Chapter 9; P713
//  Threads

public class ManyNames {
    public static void main(String[] args) {
        //  Make one Runnable
        NameRunnable nr = new NameRunnable();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Fred");
        two.setName("Lucy");
        three.setName("Ricky");
        one.start();
        two.start();
        three.start();

        //  P714
        //  run the for loop 400 times
    }
}

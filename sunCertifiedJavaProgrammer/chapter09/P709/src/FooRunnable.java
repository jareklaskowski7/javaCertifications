//	Sun Certified Java Programmer
//	Chapter 9; P709
//  Threads

class FooRunnable implements Runnable {
    public void run() {
        for (int x = 1; x < 6; x++) {
            System.out.println("Runnable running");
        }
    }
    //  P710
    /*Thread t = new Thread();
        t.run();    //  Legal, but does not start a new thread*/
}

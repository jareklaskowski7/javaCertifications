//	Sun Certified Java Programmer
//	Chapter 9; P710_711
//  Threads

class NameRunnable implements Runnable {
    public void run() {
        System.out.println("NameRunnable running");
        System.out.println("Run by " + Thread.currentThread().getName());
    }
}

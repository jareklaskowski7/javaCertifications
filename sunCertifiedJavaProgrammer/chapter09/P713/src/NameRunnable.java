//	Sun Certified Java Programmer
//	Chapter 9; P713
//  Threads

class NameRunnable implements Runnable {
    public void run() {
        for (int x = 1; x <= 1000; x++) {
            System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x);
        }
    }
}

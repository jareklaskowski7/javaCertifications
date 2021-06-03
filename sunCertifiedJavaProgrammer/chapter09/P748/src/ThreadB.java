//	Sun Certified Java Programmer
//	Chapter 9; P748
//  Threads

class ThreadB extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }
}

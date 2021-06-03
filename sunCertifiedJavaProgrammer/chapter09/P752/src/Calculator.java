//	Sun Certified Java Programmer
//	Chapter 9; P752
//  Threads

class Calculator extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notifyAll();
        }
    }
}

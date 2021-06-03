//	Sun Certified Java Programmer
//	Chapter 9; P705
//  Threads

class MyThread extends Thread {
    // P705
    public void run() {
        System.out.println("Important job running in MyThread");
    }

    // P706
    public void run(String s) {
        System.out.println("String in run is " + s);
    }
}

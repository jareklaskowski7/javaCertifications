//	Sun Certified Java Programmer
//	Chapter 9; P736
//  Threads

class SyncTest {
    public void doStuff() {
        System.out.println("not synchronized");
        synchronized(this) {
            System.out.println("synchronized");
        }

        //  P737
        /*public synchronized void doStuff() {
            System.out.println("synchronized");
        }*/
        //  is equivalent to this:
        /*public void doStuff() {
            synchronized(this)
            System.out.println("synchronized");
        }*/

        /*public static synchronized int getCount() {
            return count;
        }*/
    }
}

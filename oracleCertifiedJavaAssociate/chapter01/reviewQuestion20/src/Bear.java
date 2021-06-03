// A
// finalize() is guaranteed to be called
// B
// finalize() might or might not be called
// C
// finalize() is guaranteed not to be called
// D
// Garbage collection is guaranteed to run
// E
// Garbage collection might or might not run
// F
// Garbage collection is guaranteed not to run
// G
// The code does not compile

public class Bear {
    protected void finalize() {
        System.out.println("Roar!");
    }
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear = null;
        System.gc();
    } }

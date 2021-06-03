//	Sun Certified Java Programmer
//	Chapter 2, P110
//  Object Orientation

import java.io.*;   //  I added this import to fix the code (Jarek)

class B extends A {
    public void doStuff(String s) {
    }

    //  Legal overloads:
    public void changeSize(int size, String name) {
    }

    // Mistake!
    public int changeSize(int size, float pattern) {
    }

    public void changeSize(float pattern, String name) throws IOException {
    }
}

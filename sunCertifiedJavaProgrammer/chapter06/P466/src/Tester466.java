//	Sun Certified Java Programmer
//	Chapter 6, P466
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Tester466 {
    public static void main(String[] args) {
        Collar c = new Collar(3);
        Dog d = new Dog(c, 8);

    private void writeObject(ObjectOutputStream os) {
        //  your code for saving the Collar variables
    }

    private void readObject(ObjectInputStream is) {
        //  your code to read the Collar state, create a new Collar,
        //  and assign it to the Dog
    }
}
}

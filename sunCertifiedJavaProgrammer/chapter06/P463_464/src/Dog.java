//	Sun Certified Java Programmer
//	Chapter 6, P463_464
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Dog implements Serializable {
    private Collar theCollar;
    private int dogSize;

    public Dog(Collar collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar getCollar() {
        return theCollar;
    }
}

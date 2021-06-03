//	Sun Certified Java Programmer
//	Chapter 6, P463
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Dog implements Serializable {
    //  the rest of the code as before
    //  Serializable has no methods to implement
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

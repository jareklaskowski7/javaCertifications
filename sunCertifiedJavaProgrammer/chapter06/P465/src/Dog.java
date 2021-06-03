//	Sun Certified Java Programmer
//	Chapter 6, P465
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Dog implements Serializable {
    private transient Collar theCollar;     //  add transient
    //  the rest of the class as before
    private int dogSize;

    public Dog(Collar collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar getCollar() {
        return theCollar;
    }
}

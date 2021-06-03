//	Sun Certified Java Programmer
//	Chapter 6, P463_464
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Collar implements Serializable {
    private int collarSize;

    public Collar(int size) {
        collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }
}

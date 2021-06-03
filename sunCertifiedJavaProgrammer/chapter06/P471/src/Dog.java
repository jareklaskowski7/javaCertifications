//	Sun Certified Java Programmer
//	Chapter 6, P471
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Dog extends Animal implements Serializable {
    String name;

    Dog(int w, String n) {
        weight = w;     //  inherited
        name = n;       //  not inherited
    }
}

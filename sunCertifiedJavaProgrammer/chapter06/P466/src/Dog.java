//	Sun Certified Java Programmer
//	Chapter 6, P466
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Dog implements Serializable {
    transient private Collar theCollar;     //  we can't serialize this
    private int dogSize;

    public Dog(Collar collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar getCollar() {
        return theCollar;
    }

    private void writeObject(ObjectOutputStream os) {
        //  throws IOException {                        //  1
        try {
            os.defaultWriteObject();                    //  2
            os.writeInt(theCollar.getCollarSize());     //  3
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) {
        //  throws IOException, ClassNotFoundException {    //  4
        try {
            is.defaultReadObject();                         //  5
            theCollar = new Collar(is.readInt());           //  6
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

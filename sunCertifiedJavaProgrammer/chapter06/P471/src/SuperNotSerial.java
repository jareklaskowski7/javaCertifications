//	Sun Certified Java Programmer
//	Chapter 6, P471
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class SuperNotSerial {
    public static void main(String[] args) {

        Dog d = new Dog(35, "Fido");
        System.out.println("before: " + d.name + " "
                + d.weight);
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (Dog) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("after:  " + d.name + " "
                + d.weight);
    }
}

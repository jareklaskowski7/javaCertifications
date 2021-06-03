//	Sun Certified Java Programmer
//	Chapter 6, P445_22
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Writer1 {
    public static void main(String[] args) {
        try {           //  warning: exceptions possible
            boolean newFile = false;
            File file = new File            //  it's only an object
                    ("fileWrite1.txt");
            System.out.println(file.exists());      //  look for a real file
            newFile = file.createNewFile();         //  maybe create a file!
            System.out.println(newFile);            //  already there?
            System.out.println(file.exists());      //  look again
        } catch (IOException e) {
        }
    }
}

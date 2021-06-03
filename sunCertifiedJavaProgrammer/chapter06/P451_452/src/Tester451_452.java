//	Sun Certified Java Programmer
//	Chapter 6, P451_452
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Tester451_452 {
    public static void main(String[] args) {
        //  P451
        /*File file = new File("fileWrite.txt");     //  create a File
        PrintWriter pw = new PrintWriter(file);*/     //  pass file to
        //  the PrintWriter
        //  constructor

        /*File file = new File("fileWrite2.txt");     //  create a File object
        FileWriter fw = new FileWriter(file);       //  create a FileWriter
                                                    //  that will send its
                                                    //  output to a File
        PrintWriter pw = new PrintWriter(fw);       //  create a PrintWriter
                                                    //  that will send its
                                                    //  output to a Writer

        pw.println("howdy");                        //  write the data
        pw.println("folks");*/

        //  P452
        /*File file =
                new File("fileWrite2.txt");     //  create a File object AND
                                                //  open "fileWrite2.txt"
        FileReader fr =
                new FileReader(file);           //  create a FileReader to get
                                                //  data from 'file'
        BufferedReader br =
                new BufferedReader(fr);         //  create a BufferedReader to
                                                //  get its data from a Reader
        String data = br.readLine();*/            //  read some data
    }
}

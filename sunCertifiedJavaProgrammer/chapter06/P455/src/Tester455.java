//	Sun Certified Java Programmer
//	Chapter 6, P455
//  Strings, I/O, Formatting, and Parsing

import java.io.*;

class Tester455 {
    public static void main(String[] args) {
        File existingDir = new File("existingDir");     //  assign a dir
        System.out.println(existingDir.Directory());
        File existingDirFile = new File(
                existingDir, "existingDirFile.txt");    //  assign a file
        System.out.println(existingDirFile.isFile());

        FileReader fr = new FileReader(existingDirFile);
        BufferedReader br = new BufferedReader(fr);     //  make a Reader

        String s;
        while ((s = br.readLine()) != null)             //  read data
            System.out.println(s);

        br.close();
    }
}

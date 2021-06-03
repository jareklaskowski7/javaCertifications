//	Sun Certified Java Programmer
//	Chapter 6, P453
//  Strings, I/O, Formatting, and Parsing

class Tester453 {
    public static void main(String[] args) {
        //  P453
        /*File file = new File("foo");

        File file = new File("foo");        //  no file yet
        file.createNewFile();*/               //  make a file, "foo" which
        //  is assigned to 'file'

        /*File file = new File("foo");        //  no file yet
        PrintWriter pw =
                new PrintWriter(file);*/      //  make a PrintWriter object AND
        //  make a file, "foo" to which
        //  'file' is assigned, AND assign
        //  'pw' to the PrintWriter

        //  P454
        /*File myDir = new File("mydir");     //  create an object
        myDir.mkdir();                      //  create an actual directory

        File myFile = new File(myDir, "myFile.txt");
        myFile.createNewFile();

        PrintWriter pw = new PrintWriter(myFile);
        pw.println("new stuff");
        pw.flush();
        pw.close();*/

        File myDir = new File("mydir");
        //  myDir.mkdir();
        File myFile = new File(
                myDir, "myFile.txt");
        myFile.createNewFile();     //  exception if no mkdir;
        //  java.io.IOException: No such file or directory
    }
}

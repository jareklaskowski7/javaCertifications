//	Sun Certified Java Programmer
//	Chapter 5, P377
//  Flow Control, Exceptions, and Assertions

class Tester377 {
    public static void main(String[] args) {
        catch(IOException e)
        {
            //  Do things, then if you decide you can't handle it...
            throw e;
        }

    public void doStuff() {
        try {
            //  risky IO things
        } catch (IOException ex) {
            //  can't handle it
            throw ex;   //  Can't throw it unless you declare it
        }
    }
}
}

//	Sun Certified Java Programmer
//	Chapter 5, P373
//  Flow Control, Exceptions, and Assertions

import java.io.*;

class Test {
    public int myMethod1() throws EOFException {
        return myMethod2();
    }

    public int myMethod2() throws EOFException {
        //  code that actually could throw the exception goes here
        return 1;
    }

    public void myMethod3() {
        //  code that could throw a NullPointerException goes here
    }
}

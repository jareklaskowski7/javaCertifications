//	Sun Certified Java Programmer
//	Chapter 5, P374
//  Flow Control, Exceptions, and Assertions

class MyException extends Exception {
    void someMethod() {
        doStuff();
    }

    void doStuff() throws MyException {
        try {
            throw new MyException();
        } catch (MyException me) {
            throw me;
        }
    }
}

//	Sun Certified Java Programmer
//	Chapter 5, P376
//  Flow Control, Exceptions, and Assertions

class TestEx {
    public static void main(String[] args) {
        badMethod();
    }

    static void badMethod() {   //  No need to declare an Error
        doStuff();
    }

    static void doStuff() {     //  No need to declare an Error
        try {
            throw new Error();
        } catch (Error me) {
            throw me;   //  We catch it, but then rethrow it
        }
    }
}

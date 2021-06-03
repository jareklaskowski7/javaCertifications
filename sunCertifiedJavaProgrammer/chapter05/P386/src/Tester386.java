//	Sun Certified Java Programmer
//	Chapter 5, P386
//  Flow Control, Exceptions, and Assertions

class Tester386 {
    void noReturn() {
    }

    int aReturn() {
        return 1;
    }

    void go() {
        int x = 1;
        boolean b = true;

        //  the following six are legal assert statements
        assert (x == 1);
        assert (b);
        assert true;
        assert (x == 1) : x;
        assert (x == 1) : aReturn();
        assert (x == 1) : new ValidAssert();

        //  the following six are ILLEGAL assert statements
        assert (x = 1);      //  none of these are booleans
        assert (x);
        assert 0;
        assert (x == 1) : ;      //  none of these return a value
        assert (x == 1) : noReturn();
        assert (x == 1) : ValidAssert va;
    }

    public static void main(String[] args) {
    }
}

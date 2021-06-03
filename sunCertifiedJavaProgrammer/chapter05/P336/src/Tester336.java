//	Sun Certified Java Programmer
//	Chapter 5, P336
//  Flow Control, Exceptions, and Assertions

class Tester336 {
    public static void main(String[] args) {
        final int a = 1;
        final int b;
        b = 2;
        int x = 0;
        switch (x) {
            case a:     //  ok
            case b:     //  compiler error
        }
    }
}

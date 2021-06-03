//	Sun Certified Java Programmer
//	Chapter 6, P506
//  Strings, I/O, Formatting, and Parsing

class Tester506 {
    public static void main(String[] args) {
        //printf("format string", argument(s));
        //System.out.printf("%2$d + %1$d", 123, 456);
        //  P508
        int i1 = -123;
        int i2 = 12345;
        System.out.printf(">%1$(7d< \n", i1);
        System.out.printf(">%0,7d< \n", i2);
        System.out.printf(">%+-7d< \n", i2);
        System.out.printf(">%2$b + %1$5d< \n", i1, false);
    }
}

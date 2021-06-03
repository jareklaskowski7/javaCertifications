//	Sun Certified Java Programmer
//	Chapter 6, P497_498
//  Strings, I/O, Formatting, and Parsing

import java.util.regex.*;

class Tester497_498 {
    public static void main(String[] args) {

        //  P497
        String pattern = "\\d";      //  compiler error!
        //String pattern = "\\d";     //  a compilable metacharacter

        //String p = ".";             //  regex sees this as the "." metacharacter
        //String p = "\.";            //  the compiler sees this as an illegal
        //  Java escape sequence
        String p = "\\.";           //  the compiler is happy, and regex sees a
        //  dot, not a metacharacter
    }
}

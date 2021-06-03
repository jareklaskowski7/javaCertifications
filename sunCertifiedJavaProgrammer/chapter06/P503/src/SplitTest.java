//	Sun Certified Java Programmer
//	Chapter 6, P503
//  Strings, I/O, Formatting, and Parsing

import java.util.*;

class SplitTest {
    public static void main(String[] args) {
        //  P503
        //SplitTest s() { }
        /*SplitTest sp = new SplitTest("ab5 ccc 45 @" "\\d");
        String[] tokens = args[0].split(args[1]);
        System.out.println("count " + tokens.length);
        for(String s : tokens)
            System.out.println(">" + s + "<");*/
        //  P504
        System.out.println("\" \\");
        String s = "ab.cde.fg";
        String[] tokens = s.split("\\.");
        //System.out.println(tokens);
    }
}

//	Sun Certified Java Programmer
//	Chapter 6, P489
//  Strings, I/O, Formatting, and Parsing

import java.util.regex.*;

class RegexSmall {
    public static void main(String[] args) {
        //  P489
        //  P490
        //  P491
        //  P492
        //  P493
        //  P494
        //  P495
        //  P496
        Pattern p = Pattern.compile(".*?xx");      //  the expression
        Matcher m = p.matcher("yyxxxyxx");       //  the source
        while (m.find()) {
            System.out.print(m.start() + " ");
        }
    }
}

//	Sun Certified Java Programmer
//	Chapter 6, P479
//  Strings, I/O, Formatting, and Parsing

import java.util.*;

class Tester479 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        //c.add(Calendar.HOUR, -4);           //  subtract 4 hours from c's value
        //c.add(Calendar.YEAR, 2);            //  add 2 years to c's value
        //c.add(Calendar.DAY_OF_WEEK, -2);    //  subtract two days from c's value

        //  assume c is October 8, 2001
        c.roll(Calendar.MONTH, 9);          //  notice the year in the output
        Date d4 = c.getTime();
        System.out.println("new date " + d4.toString());
    }
}

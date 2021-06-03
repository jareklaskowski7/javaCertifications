//	Sun Certified Java Programmer
//	Chapter 6, P476
//  Strings, I/O, Formatting, and Parsing

import java.util.*;

class TestDates {
    public static void main(String[] args) {
        //  P476
        Date d1 = new Date(1000000000000L);     //  a trillion!
        System.out.println("1st date " + d1.toString());
        d1.setTime(d1.getTime() + 3600000);     //  3600000 millis / hour
        System.out.println("new time " + d1.toString());
        //  P477
        Date now = new Date();
        now.getTime();
        System.out.println("now " + now.toString());
        //  The Calendar Class
        //Calendar c = new Calendar();    //  illegal, Calendar is abstract
        Calendar cal = Calendar.getInstance();
    }
}

//	Sun Certified Java Programmer
//	Chapter 6, P484
//  Strings, I/O, Formatting, and Parsing

import java.util.*;

class Tester484 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2010, 11, 14);
        Date d2 = c.getTime();

        Locale locBR = new Locale("pt", "BR");      //  Brazil
        Locale locDK = new Locale("da", "DK");      //  Denmark
        Locale locIT = new Locale("it", "IT");      //  Italy

        System.out.println("def " + locBR.getDisplayCountry());
        System.out.println("loc " + locBR.getDisplayCountry(locBR));

        System.out.println("def " + locDK.getDisplayLanguage());
        System.out.println("loc " + locDK.getDisplayLanguage(locDK));
        System.out.println("D>I " + locDK.getDisplayLanguage(locIT));
    }
}

//	Sun Certified Java Programmer
//	Chapter 3, P258_2
//  Assignments

import java.util.Date;

public class GarbageFactory {
    public static void main(String[] args) {
        Date d = getDate();
        //doComplicatedStuff();
        System.out.println("d = " + d);
    }

    public static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }
}

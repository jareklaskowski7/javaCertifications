//	Sun Certified Java Programmer
//	Chapter 1, P77_8
//  Declarations and Access Control

public class TestDays {
    public enum Days {MON, TUE, WED}

    ;

    public static void main(String[] args) {
        for (Days d : Days.values())
            ;
        Days[] d2 = Days.values();
        System.out.println(d2[2]);

        //  Correct Answer: B
    }
}

//	Sun Certified Java Programmer
//	Chapter 7, P607_1
//  Generics and Collections

import java.util.*;

public class Tester607_1 {
    public static void main(String[] args) {
        List test = new ArrayList();
        test.add(43);
        int x = (Integer) test.get(0);           //  you must cast !!

        List<Integer> test2 = new ArrayList<Integer>();
        test2.add(343);
        int x2 = test2.get(0);                  //  cast not necessary
    }
}

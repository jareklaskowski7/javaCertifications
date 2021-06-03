//	Sun Certified Java Programmer
//	Chapter 7, P579_2
//  Generics and Collections

import java.util.*;

public class Tester579_2 {
    public static void main(String[] args) {
        List<Integer> iL = new ArrayList<Integer>();
        for (int x = 0; x < 3; x++)
            iL.add(x);
        Object[] oa = iL.toArray();             //  create an Object array
        Integer[] ia2 = new Integer[3];
        ia2 = iL.toArray(ia2);                  //  create an Integer array
    }
}

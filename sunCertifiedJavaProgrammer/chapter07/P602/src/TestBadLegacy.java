//	Sun Certified Java Programmer
//	Chapter 7, P602
//  Generics and Collections

import java.util.*;

public class TestBadLegacy {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(6);
        Inserter in = new Inserter();
        in.insert(myList);          //  pass List<Integer> to legacy code
    }
}

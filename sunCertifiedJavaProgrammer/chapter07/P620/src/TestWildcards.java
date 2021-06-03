//	Sun Certified Java Programmer
//	Chapter 7, P620
//  Generics and Collections

import java.util.*;

public class TestWildcards {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        Bar bar = new Bar();
        bar.doInsert(myList);
    }
}

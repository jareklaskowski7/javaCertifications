//	Sun Certified Java Programmer
//	Chapter 7, P601
//  Generics and Collections
//  a Java 5 class using a generic collection

import java.util.*;

public class TestLegacy {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        //  type safe collection
        myList.add(4);
        myList.add(6);
        Adder adder = new Adder();
        int total = adder.addAll(myList);
        //  pass it to an untyped argument
        System.out.println(total);
    }
}

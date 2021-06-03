//	Sun Certified Java Programmer
//	Chapter 7, P568
//  Generics and Collections

import java.util.*;

public class Tester568
{
    public static void main(String[] args)
    {
        List myInts = new ArrayList();      //  pre Java 5 declaration
        myInts.add(new Integer(42));        //  had to wrap an int

        myInts.add(42);                     //  autoboxing handles it!
    }
}

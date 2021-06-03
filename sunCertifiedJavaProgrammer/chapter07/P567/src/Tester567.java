//	Sun Certified Java Programmer
//	Chapter 7, P567
//  Generics and Collections

import java.util.*;

class Tester567
{
    public static void main(String[] args)
    {
        //List myList = new ArrayList();
        //List<String> myList = new ArrayList<String>();

        List<String> test = new ArrayList<String>();
        String s = "hi";
        test.add("string");
        test.add(s);
        test.add(s+s);
        System.out.println(test.size());
        System.out.println(test.contains(42));
        System.out.println(test.contains("hihi"));
        test.remove("hi");
        System.out.println(test.size());
    }
}

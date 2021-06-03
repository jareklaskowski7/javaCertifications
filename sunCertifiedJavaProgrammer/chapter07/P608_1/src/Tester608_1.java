//	Sun Certified Java Programmer
//	Chapter 7, P608_1
//  Generics and Collections

import java.util.*;

public class Tester608_1 {
    public static void main(String[] args) {
        //List<Object> myList = new ArrayList<JButton>();         //  NO!
        //List<Number> numbers = new ArrayList<Integer>();        //  NO!
        //  remember that Integer is a subtype of Number

        List<JButton> myList = new ArrayList<JButton>();        //  yes
        List<Object> myList = new ArrayList<Object>();          //  yes
        List<Integer> myList = new ArrayList<Integer>();        //  yes
    }
}

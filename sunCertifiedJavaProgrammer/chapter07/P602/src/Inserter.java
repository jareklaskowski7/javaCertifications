//	Sun Certified Java Programmer
//	Chapter 7, P602
//  Generics and Collections

import java.util.*;

class Inserter {
    //  method with a non-generic List argument
    /*void insert(List list) {
        list.add(new Integer(42));      //  adds to the incoming list
    }*/

    void insert(List list) {
        list.add(new String("42"));     //  put a String in the list
        //  passed in
    }
}

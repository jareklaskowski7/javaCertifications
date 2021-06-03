//	Sun Certified Java Programmer
//	Chapter 7, P627_2
//  Generics and Collections

import java.util.*;

public class CreateAnArrayList {
    public <T> void makeArrayList(T t) {    //  take an object of an
        //  unknown type and use a
        //  "T" to represent the type
        List<T> list = new ArrayList<T>();  //  now we can create the
        //  list using "T"
        list.add(t);
    }
}

    public void makeArrayList(Dog t) {
        List<Dog> list = new ArrayList<Dog>();
        list.add(t);
    }

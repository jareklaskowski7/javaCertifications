//	Sun Certified Java Programmer
//	Chapter 7, P620
//  Generics and Collections

import java.util.*;

class Bar {
    void doInsert(List<?> list) {
        list.add(new Dog());
    }
}

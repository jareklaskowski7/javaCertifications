//	Sun Certified Java Programmer
//	Chapter 9; P744
//  Threads

import java.util.*;

public class NameList {
    private List names = new LinkedList();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized String removeFirst() {
        if (names.size() > 0)
            return (String) names.remove(0);
        else
            return null;
    }
}

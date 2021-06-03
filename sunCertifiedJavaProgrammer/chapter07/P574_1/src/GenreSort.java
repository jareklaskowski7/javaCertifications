//	Sun Certified Java Programmer
//	Chapter 7, P574_1
//  Generics and Collections

import java.util.*;

class GenreSort implements Comparator<DVDInfo> {
    public int compare(DVDInfo one, DVDInfo two) {
        return one.getGenre().compareTo(two.getGenre());
    }
}

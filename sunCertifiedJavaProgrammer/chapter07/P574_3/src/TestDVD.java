//	Sun Certified Java Programmer
//	Chapter 7, P574_3
//  Generics and Collections

import java.util.*;
import java.io.*;           //  populateList() needs this

public class TestDVD {
    ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();

    public static void main(String[] args) {
        new TestDVD().go();
    }

    public void go() {
        populateList();
        System.out.println(dvdlist);            //  output as read from file
        Collections.sort(dvdlist);
        System.out.println(dvdlist);            //  output sorted by title

        GenreSort gs = new GenreSort();
        Collections.sort(dvdlist, gs);
        System.out.println(dvdlist);            //  output sorted by genre
    }

    public void populateList() {
        //  read the file, create DVDInfo instances, and
        //  populate the ArrayList dvdlist with these instances
    }
}

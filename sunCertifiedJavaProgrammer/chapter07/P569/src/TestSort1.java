//	Sun Certified Java Programmer
//	Chapter 7, P569
//  Generics and Collections

import java.util.*;

class TestSort1
{
    public static void main(String[] args)
    {
        ArrayList<String> stuff = new ArrayList<String>();      //  #1
        stuff.add("Denver");
        stuff.add("Boulder");
        stuff.add("Vail");
        stuff.add("Aspen");
        stuff.add("Telluride");
        System.out.println("unsorted " + stuff);
        Collections.sort(stuff);                           //  #2
        System.out.println("sorted " + stuff);
    }
}

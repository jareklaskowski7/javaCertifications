//	Sun Certified Java Programmer
//	Chapter 7, P595
//  Generics and Collections

import java.util.*;

public class Tester595 {
    public static void main(String[] args) {
        String[] sa = {">ff<", "> f<", ">f <", ">FF<"};    //  ordered?
        PriorityQueue<String> pq3 = new PriorityQueue<String>();
        for (String s : sa)
            pq3.offer(s);
        for (String s : sa)
            System.out.print(pq3.poll() + " ");
    }
}

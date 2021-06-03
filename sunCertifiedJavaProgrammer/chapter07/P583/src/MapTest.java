//	Sun Certified Java Programmer
//	Chapter 7, P583
//  Generics and Collections

import java.util.*;

class MapTest {
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<Object, Object>();

        m.put("k1", new Dog("aiko"));           //  add some key/value pairs
        m.put("k2", Pets.DOG);
        m.put(Pets.CAT, "CAT key");
        Dog d1 = new Dog("clover");             //  let's keep this reference
        m.put(d1, "Dog key");
        m.put(new Cat(), "Cat key");

        System.out.println(m.get("k1"));        //  #1
        String k2 = "k2";
        System.out.println(m.get(k2));        //  #2
        Pets p = Pets.CAT;
        System.out.println(m.get(p));           //  #3
        System.out.println(m.get(d1));          //  #4
        System.out.println(m.get(new Cat()));   //  #5
        System.out.println(m.size());           //  #6

        //  P585
        d1.name = "magnolia";
        System.out.println(m.get(d1));

        d1.name = "magnolia";
        System.out.println(m.get(d1));                  //  1
        d1.name = "clover";
        System.out.println(m.get(new Dog("clover")));   //  2
        d1.name = "arthur";
        System.out.println(m.get(new Dog("clover")));   //  3
    }
}

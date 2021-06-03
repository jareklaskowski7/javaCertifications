//	Sun Certified Java Programmer
//	Chapter 3, P252_2
//  Assignments

class BoxAndWiden {
    static void go(Object o)  //                    (boxing 1, widening 2)
    {
        Byte b2 = (Byte) o;   //  ok - it's a Byte object (object ref. 3, casting)
        System.out.println(b2);
    }

    public static void main(String[] args) {
        byte b = 5;
        go(b);      //  can this byte turn into an Object ?
    }
}

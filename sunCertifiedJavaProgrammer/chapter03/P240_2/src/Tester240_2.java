//	Sun Certified Java Programmer
//	Chapter 3, P240_2
//  Assignments

class Tester240_2 {
    public static void main(String[] args) {
        Integer i2 = new Integer(42);   //  make a new wrapper object
        System.out.print("one    ");
        System.out.println(i2);

        byte b = i2.byteValue();        //  convert i2's value to a byte
        //  primitive
        System.out.print("two    ");
        System.out.println(b);

        short s = i2.shortValue();      //  another of Integer's xxxValue
        //  methods
        System.out.print("three  ");
        System.out.println(s);

        double d = i2.doubleValue();    //  yet another of Integer's
        //  xxxValue methods
        System.out.print("four   ");
        System.out.println(d);
        //  or

        /*Float f2 = new Float(3.14f);    //  make a new wrapper object
        short s = f2.shortValue();      //  convert f2's value to a short
                                        //  primitive
        System.out.println(s);          //  result is 3 (truncated, not
                                        //  rounded)*/
    }
}

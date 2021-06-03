//	Sun Certified Java Programmer
//	Chapter 3, P239
//  Assignments

class Tester239 {
    public static void main(String[] args) {

        Integer i1 = new Integer(42);
        Integer i2 = new Integer("42");

        //  or

        Float f1 = new Float(3.14f);
        Float f2 = new Float("3.14f");

        Character c1 = new Character('c');

        Boolean b = new Boolean("false");
        if (b)      //  won't compile, using Java 1.4 or earlier
            System.out.println("yes");
    }
}

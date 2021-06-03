//	Sun Certified Java Programmer
//	Chapter 3, P191
//  Assignments

class Tester191 {
    public static void main(String[] args) {
        //  P191
        //  Primitive Assignments
        //  P192
        int x = 7;          //  literal assignment
        int y = x + 2;      //  assignment with an expression
        //  (including a literal)
        int z = x * y;      //  assignment with an expression

        byte b1 = 27;
        byte b10 = 126;
        byte b11 = 127;
        byte b12 = 128;
        byte b13 = -128;
        byte b14 = -129;
        byte b2 = (byte) 27; //  Explicitly cast the int literal to a byte

        byte a3 = 3;         //  No problem, 3 fits in a byte
        byte b3 = 8;         //  No problem, 8 fits in a byte
        byte c3 = b3 + c3;   //  Should be no problem, sum of the two bytes
        //  fits in a byte
        //  P193
        byte c4 = (byte) (a3 + b3);

        //  Primitive Casting
        int a1 = 100;
        long b1 = a1;         //  Implicit cast, an int value always fits in a long

        float a2 = 100.001f;
        int b2 = (int) a2;     //  Explicit cast, the float could lose info

        //  P194
        double d = 100L;    //  Implicit cast*/
    }
}

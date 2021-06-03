//	Sun Certified Java Programmer
//	Chapter 4, P290
//  Operators

class Tester290 {
    static int x;
    static int y;

    Tester290() {
        x = 0;
        y = 0;
    }

    public static void main(String[] args) {
        Tester290 t1 = new Tester290();
        //  Print the values of y and x
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        //  Perform operations
        y = y - 6;
        x = x + 2 * 5;
        //  Print the values of y and x
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        //  Initialize y and x to 0
        y = 0;
        x = 0;
        //  Compound operators
        y -= 6;
        x += 2 * 5;
        //  Print the values of y and x
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        //  Perform operations
        y = y - 6;
        x *= 2 + 5;
        //  Print the values of y and x
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}

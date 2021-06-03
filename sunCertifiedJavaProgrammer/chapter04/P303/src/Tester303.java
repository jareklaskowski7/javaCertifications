//	Sun Certified Java Programmer
//	Chapter 4, P303
//  Operators

class Tester303 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        if ((y == x++) | (x < ++y)) {
            System.out.println("x = " + x + " y = " + y);
        }
    }
}

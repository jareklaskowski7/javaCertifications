//	Sun Certified Java Programmer
//	Chapter 2, P111
//  Object Orientation

class Adder {
    public int addThem(int x, int y) {
        System.out.println("int version");
        return x + y;
    }

    //  Overload the addThem method to add doubles instead of ints
    public double addThem(double x, double y) {
        System.out.println("double version");
        return x + y;
    }
}

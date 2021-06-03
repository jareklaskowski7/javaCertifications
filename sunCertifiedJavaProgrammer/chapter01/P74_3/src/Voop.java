//	Sun Certified Java Programmer
//	Chapter 1, P74_3
//  Declarations and Access Control

class Voop {
    public static void main(String[] args) {
        doStuff(1);
        doStuff(1, 2);
    }

    //  insert code here
    static void doStuff(int... doArgs) {}
    //static void doStuff(int[] doArgs) {}
    //static void doStuff(int doArgs...) {}
    //static void doStuff(int... doArgs, int y) {}
    //static void doStuff(int x, int... doArgs) {}

    //  A and E are correct
}

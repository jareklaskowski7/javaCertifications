//	Sun Certified Java Programmer
//	Chapter 5, P334
//  Flow Control, Exceptions, and Assertions

class Tester334 {
    public static void main(String[] args) {
        boolean boo = false;
        if (boo = true) {
        }

        int x = 3;
        if (x = 5) {
        }      //  Won't compile because x is not a boolean!
    }
}

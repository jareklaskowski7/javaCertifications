//	Sun Certified Java Programmer
//	Chapter 5, P383
//  Flow Control, Exceptions, and Assertions

class Tester383 {
    public static void main(String[] args) {
        int x = 3;
        boolean y = true;
        if (x > 2 && y) {
            //  do something
        } else if (x < 2 || y) {
            //  do something
        } else {
            //  x must be 2
            //  do something else
        }
        while (true) {
            if (x > 2) {
                break;
            }
            System.out.print("If we got here " +
                    "something went horribly wrong");
        }
    }
}

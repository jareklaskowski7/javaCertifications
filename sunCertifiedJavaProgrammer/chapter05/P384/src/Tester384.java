//	Sun Certified Java Programmer
//	Chapter 5, P384
//  Flow Control, Exceptions, and Assertions

class Tester384 {
    public static void main(String[] args) {
        int num = 1;
        int x = 2;
        int y = 3;
        /*private void methodA(int num) {
            if (num >= 0) {
                useNum(num + x);
            } else {    //  num must be < 0
                        //  This code should never be reached!
                System.out.println("Yikes! num is a negative number! "
                                    + num);
            }
        }*/
        /*private void methodA(int num) {
            assert (num>=0);    //  throws an AssertionError
                                //  if this test isn't true
            useNum(num + x);
        }*/
        /*private void methodA(int num) {
            useNum(num + x);    //  we've tested this;
                                //  we now know we're good here
        }*/
        //  P385
        /*private void doStuff() {
            assert (y > x);
            //  more code assuming y is greater than x
        }*/
        /*private void doStuff() {
            assert (y > x) : "y is " + y + " x is " + x;
            //  more code assuming y is greater than x
        }*/
    }
}

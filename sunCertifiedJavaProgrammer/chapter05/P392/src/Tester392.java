//	Sun Certified Java Programmer
//	Chapter 5, P392
//  Flow Control, Exceptions, and Assertions

class Tester392 {
    /*/  P392
    public void doStuff(int x) {
            assert (x > 0);     //  inappropriate !
            //  do things with x
    }*/
    /*/  P393
    private void doMore(int x) {
            assert (x > 0);
            //  do things with x
        }*/
    //  P394
    int x;
    int y;

    public void doStuff() {
        assert (modifyThings());
        //  continues on
    }

    public boolean modifyThings() {
        y = x++;
        return true;
    }

    public static void main(String[] args) {
        /*/  P393
        int x = 0;
        int y;
        switch (x) {
        case 1: y = 3; break;
        case 2: y = 9; break;
        case 3: y = 27; break;
        default: assert false;  //  we're never supposed to get here!
        }*/
    }
}

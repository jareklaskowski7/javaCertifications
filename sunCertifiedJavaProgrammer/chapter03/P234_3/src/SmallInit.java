//	Sun Certified Java Programmer
//	Chapter 3, P234_3
//  Assignments

class SmallInit {
    static int x;
    int y;

    static {
        x = 7;
    }      //  static init block

    {
        y = 8;
    }              //  instance init block
}

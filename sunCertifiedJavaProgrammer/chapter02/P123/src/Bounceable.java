//	Sun Certified Java Programmer
//	Chapter 2, P123
//  Object Orientation

interface Bounceable extends Moveable, Spherical {   //  ok!
    void bounce();

    void setBounceFactor(int bf);
}

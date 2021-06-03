//	Sun Certified Java Programmer
//	Chapter 2, P120
//  Object Orientation

class BeachBall extends Ball {
    //  P121
    //  Even though we don't say it in the class declaration above,
    //  BeachBall implements Bounceable, since BeachBall's abstract
    //  superclass (Ball) implements Bounceable

    public void bounce() {
        //  interesting BeachBall-specific bounce code
    }

    public void setBounceFactor(int bf) {
        //  clever BeachBall-specific code for setting a bounce factor
    }
    //  if class Ball defined any abstract methods, they'll have to be
    //  implemented here as well.
}

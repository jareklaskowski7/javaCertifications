//	Sun Certified Java Programmer
//	Chapter 2, P98
//  Object Orientation

public class Horse extends Animal {
    private Halter myHalter = new Halter();

    public void tie(LeadRope rope) {
        myHalter.tie(rope); //  Delegate tie behavior to the
        //  Halter object
    }
}

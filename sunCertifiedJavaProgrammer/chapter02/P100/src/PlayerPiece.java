//	Sun Certified Java Programmer
//	Chapter 2, P100
//  Object Orientation

class PlayerPiece extends GameShape implements Animatable, Playable {
    public void movePiece() {
        System.out.println("moving game piece");
    }

    public void animate() {
        System.out.println("animating...");
    }

    public void play() {
        System.out.println("playing...");
    }
    //  more code
}

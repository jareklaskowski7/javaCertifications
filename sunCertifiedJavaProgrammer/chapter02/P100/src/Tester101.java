//	Sun Certified Java Programmer
//	Chapter 2, P100
//  Object Orientation

public class Tester101 {
    public static void main(String[] args) {
        //  P101    Legal declarations
        PlayerPiece player = new PlayerPiece();
        player.movePiece();
        player.animate();
        player.play();
        Object o = player;
        GameShape shape = player;
        Animatable mover = player;
        mover.animate();
        Playable playyer = player;
        playyer.play();
    }
}

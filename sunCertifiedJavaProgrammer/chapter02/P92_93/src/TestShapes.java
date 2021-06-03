//	Sun Certified Java Programmer
//	Chapter 2, P92_93
//  Object Orientation

public class TestShapes {
    public static void main(String[] args) {
        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        doShapes(player);
        doShapes(tile);
    }

    public static void doShapes(GameShape shape) {
        shape.displayShape();
    }
}

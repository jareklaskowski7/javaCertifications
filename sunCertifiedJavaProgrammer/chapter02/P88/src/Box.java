//	Sun Certified Java Programmer
//	Chapter 2, P88
//  Object Orientation

public class Box {
    //  protect the instance variable; only an instance
    //  of Box can access it
    private int size;

    //  Provide public getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        size = newSize;
    }
}

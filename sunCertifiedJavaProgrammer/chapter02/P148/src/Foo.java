//	Sun Certified Java Programmer
//	Chapter 2, P148
//  Object Orientation

class Foo {
    int x = 3;
    float y = 4.3f;

    public static void main(String[] args) {
        for (int z = x; z < ++x; z--, y = y + z)
        //  complicated looping and branching code
    }
}

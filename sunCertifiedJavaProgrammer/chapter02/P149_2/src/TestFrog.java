//	Sun Certified Java Programmer
//	Chapter 2, P149_2
//  Object Orientation

class TestFrog {
    public static void main(String[] args) {
        Frog f = new Frog();
        int frogs = f.frogCount;    //  Access static variable
        //  FrogCount using f
        System.out.println("frogs:" + f.frogCount);
    }
}

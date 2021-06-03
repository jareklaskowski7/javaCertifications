//	Sun Certified Java Programmer
//	Chapter 3, P237
//  Assignments

class InitError {
    static int[] x = new int[4];

    static {
        x[4] = 5;
    }        //  bad array index!

    public static void main(String[] args) {
    }
}

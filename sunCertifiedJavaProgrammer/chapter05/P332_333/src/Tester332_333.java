//	Sun Certified Java Programmer
//	Chapter 5, P332_333
//  Flow Control, Exceptions, and Assertions

class Tester332_333 {
    static boolean doStuff() {
        System.out.println("do stuff");
        return true;
    }

    public static void main(String[] args) {
        int y = 5;
        int x = 2;
        if (((x > 3) && (y < 2)) | doStuff()) {
            System.out.println("true");
        }
    }
}

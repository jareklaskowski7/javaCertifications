//	Sun Certified Java Programmer
//	Chapter 5, P368
//  Flow Control, Exceptions, and Assertions

class Tester368 {
    public static void main(String[] args) {
        try {
            //  Some code here that can throw a boundary exception
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            //  some code
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

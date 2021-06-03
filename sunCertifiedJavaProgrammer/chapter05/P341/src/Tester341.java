//	Sun Certified Java Programmer
//	Chapter 5, P341
//  Flow Control, Exceptions, and Assertions

class Tester341 {
    public static void main(String[] args) {
        //int x = someNumberBetweenOneAndTen;
        int x = 7;

        switch (x) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: {
                System.out.println("x is an even number");
                break;
            }
            default:
                System.out.println("x is an odd number");
        }
    }
}

//	Sun Certified Java Programmer
//	Chapter 5, P341_342
//  Flow Control, Exceptions, and Assertions

class Tester341_342 {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
        }
        //  P342
        System.out.println();
        int y = 7;
        switch (y) {
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
        }
    }
}

//	Sun Certified Java Programmer
//	Chapter 5, P340
//  Flow Control, Exceptions, and Assertions

class Tester340 {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1: {
                System.out.println("x is one");
                break;
            }
            case 2: {
                System.out.println("x is two");
                break;
            }
            case 3: {
                System.out.println("x is three");
                break;
            }
        }
        System.out.println("out of the switch");
    }
}

//	Sun Certified Java Programmer
//	Chapter 5, P339
//  Flow Control, Exceptions, and Assertions

class Tester339 {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("x is one");
            case 2:
                System.out.println("x is two");
            case 3:
                System.out.println("x is three");
        }
        System.out.println("out of the switch");
    }
}

//	Sun Certified Java Programmer
//	Chapter 5, P335_2
//  Flow Control, Exceptions, and Assertions

class Tester335_2 {
    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
            default:
                System.out.println("Still no idea what x is");
        }
    }
}

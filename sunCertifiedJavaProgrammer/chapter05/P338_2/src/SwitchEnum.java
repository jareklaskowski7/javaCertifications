//	Sun Certified Java Programmer
//	Chapter 5, P338_2
//  Flow Control, Exceptions, and Assertions

class SwitchEnum {
    public static void main(String[] args) {
        Color c = Color.green;
        switch (c) {
            case red:
                System.out.print("red ");
            case green:
                System.out.print("green ");
            case blue:
                System.out.print("blue ");
            default:
                System.out.print("done");
        }
    }
}

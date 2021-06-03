//	Sun Certified Java Programmer
//	Chapter 5, P337_2
//  Flow Control, Exceptions, and Assertions

class Tester337_2 {
    public static void main(String[] args) {
        int temp = 90;
        switch (temp) {
            case 80:
                System.out.println("80");
            case 80:
                System.out.println("80");      //  won't compile
            case 90:
                System.out.println("90");
            default:
                System.out.println("default");
        }
    }
}

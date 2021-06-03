//	Sun Certified Java Programmer
//	Chapter 5, P356
//  Flow Control, Exceptions, and Assertions

class Tester356 {
    public static void main(String[] args) {
        int age = 15;
        outer:
        while (age <= 21) {
            if (age >= 16 & age <= 21) {
                System.out.println("get your driver's license");
                break outer;
            } else {
                System.out.println("Another year");
                age++;
                continue outer;
            }
        }   //  end of outer while loop
        System.out.println("the end");
    }
}

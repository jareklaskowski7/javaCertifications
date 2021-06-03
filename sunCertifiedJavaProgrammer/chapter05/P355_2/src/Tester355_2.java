//	Sun Certified Java Programmer
//	Chapter 5, P355_2
//  Flow Control, Exceptions, and Assertions

class Tester355_2 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello");
                continue outer;
            }   //  end of inner loop
            System.out.println("outer");  //  Never prints
        }
        System.out.println("Good-Bye");
    }
}

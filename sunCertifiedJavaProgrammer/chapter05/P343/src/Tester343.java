//	Sun Certified Java Programmer
//	Chapter 5, P343
//  Flow Control, Exceptions, and Assertions

class Tester343 {
    public static void main(String[] args) {
        //  P343
        //while (expression) {
        //  do stuff
        //}
        //or

        /*int x = 2;
        while(x == 2) {
          System.out.println(x);
          ++x;
        }
        System.out.println(x);*/
        //  P344
        //while (int x = 2) { }   //  not legal
        /*int x = 8;
        while (x > 8) {
            System.out.println("in the loop");
            x = 10;
        }
        System.out.println("past the loop");*/
        /*do {
            System.out.println("Inside loop");
        } while(false);*/
        /*/  P345
        int x = 1;
        while (x) { }       //  Won't compile; x is not a boolean
        while (x = 5) { }   //  Won't compile; resolves to 5
                            //  (as the result of assignment)
        while (x == 5) { }  //  Legal, equality test
        while (true) { }    //  Legal
        while (false) { }   //  Unreachable statement*/
    }
}

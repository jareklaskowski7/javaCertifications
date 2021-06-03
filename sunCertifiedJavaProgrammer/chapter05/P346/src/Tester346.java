//	Sun Certified Java Programmer
//	Chapter 5, P346
//  Flow Control, Exceptions, and Assertions

class Tester346 {
    public static void main(String[] args) {
        //  P346
        //*for (/*Initialization*/ ; /*Condition*/ ; /* Iteration */) {
            /* loop body */
        //}
        /*for (int i = 0; i<10; i++) {
            System.out.println("i is " + i);
        }*/
        //for (int x = 10, y = 3; y > 3; y++) { }
        /*for (int x = 1; x < 2; x++) {
            System.out.println(x);  //  Legal
        }
        System.out.println(x);      //  Not Legal!  x is now out of scope
                                    //  and can't be accessed.
        */
        //  P347
        //int y = 0;
        //for (int x = 0; ((((x < 10) && (y-- > 2)) | x == 3)); x++) { }
        //for (int x = 0; (x > 5), (y < 2); x++) { }  //  too many expressions
        /*for (int x = 0; x < 1; x++) {
            //  body code that doesn't change the value of x
        }*/
        //  P348
        /*static boolean doStuff() {
            for (int x = 0; x < 3; x++) {
                System.out.println("in for loop");
                return true;
            }
            return true;
        }*/
        /*for( ; ; ) {
            System.out.println("Inside an endless loop");
        }*/
        //  P349
        /*int i = 0;

        for (;i<10;) {
            i++;
            //  do some other work
            System.out.println(i);
        }*/
        /*for (int i = 0, j = 0; (i<10) && (j<10); i++, j++) {
            System.out.println("i is " + i + " j is " + j);
        }*/
        /*int x = 3;
        for (x = 12; x < 20; x++) { }
        System.out.println(x);*/
        //  while this is not
        //for (int x = 3; x < 20; x++) { } System.out.println(x);
        //  P350
        /*int b = 3;
        for (int a = 1; b != 1; System.out.println("iterate")) {
            b = b - a;
        }*/
    }
}

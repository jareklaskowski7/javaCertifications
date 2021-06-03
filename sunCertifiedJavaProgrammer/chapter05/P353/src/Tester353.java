//	Sun Certified Java Programmer
//	Chapter 5, P353
//  Flow Control, Exceptions, and Assertions

class Tester353 {
    public static void main(String[] args) {
        // P353
        /*boolean problem = true;
        while (true) {
            if (problem) {
                System.out.println("There was a problem");
                break;
            }
        }*/
        //  next line of code
//
    /*while (!EOF) {
        //  read a field from a file
        if (wrongField) {
            continue;   //  move to the next field in the file
        }
        //  otherwise do other stuff with the field
        */
        //  P354
       /*int y = 8;
        foo:
            for (int x = 3; x < 20; x++) {
                while(y > 7) {
                    y--;
                }
            }*/
        /*boolean isTrue = true;
        outer:
            for(int i=0; i<5; i++) {
                while (isTrue) {
                    System.out.println("Hello");
                    break outer;
                }   //  end of inner while loop
                System.out.println("Outer loop.");  //  Won't print
            }   //  end of outer for loop
        System.out.println("Good-Bye");*/
        //  P355
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

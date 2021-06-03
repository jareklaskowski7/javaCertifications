//	Sun Certified Java Programmer
//	Chapter 5, P331
//  Flow Control, Exceptions, and Assertions

class Tester331 {
    static boolean exam = false;

    static boolean done() {
        System.out.println("done");
        return true;
    }

    public static void main(String[] args) {
        //  P331
        //boolean exam = false;

        int x = 1;
        if (x == 3) {
        } else if (x < 4) {
            System.out.println("<4");
        } else if (x < 2) {
            System.out.println("<2");
        } else {
            System.out.println("else");
        }

        if (exam.done())
            if (exam.getScore() < 0.61)
                System.out.println("Try again.");
                //  Which if does this belong to?
            else System.out.println("Java master!");

        //  P332
        /*if (exam.done())
            if (exam.getScore() < 0.61)
                System.out.println("Try again.");
            //  Which if does this belong to?
        else
            System.out.println("Java master!");


        if (exam.done()) {
            if (exam.getScore() < 0.61) {
                System.out.println("Try again.");
            //  Which if does this belong to?
            } else {
              System.out.println("Java master!");
            }
        }


        if (exam.done())
            if (exam.getScore() < 0.61)
                System.out.println("Try again.");
        else
            System.out.println("Java master!");     //  Hmmmmm... now where does
                                                    //  it belong?*/
    }
}

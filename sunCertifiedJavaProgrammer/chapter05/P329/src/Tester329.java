//	Sun Certified Java Programmer
//	Chapter 5, P329
//  Flow Control, Exceptions, and Assertions

class Tester329 {
    public static void main(String[] args) {
        boolean booleanExpression = true;
        int a = 0;
        int x = 3;
        int y = 0;
        int z = 0;

        if (booleanExpression) {
            System.out.println("Inside if statement");
        }


        if (x > 3) {
            System.out.println("x is greater than 3");
        } else {
            System.out.println("x is not greater than 3");
        }

        if (x > 3) {
            y = 2;
        }
        z += 8;
        a = y + x;
        System.out.println("The value of a is " + a);
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of z is " + z);

        if (x > 3)      //  bad practice, but seen on the exam
            y = 2;
        z += 8;
        a = y + x;
        System.out.println("The value of a is " + a);
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of z is " + z);

    }
}

//	Sun Certified Java Programmer
//	Chapter 4, P293_2
//  Operators

class Tester293_2 {
    public static void main(String[] args) {
        //  Don't mistake = for == in a boolean expression.  The following is legal:
        boolean b = false;
        if (b = true) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }
    }
}

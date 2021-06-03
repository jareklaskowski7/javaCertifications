//	Sun Certified Java Programmer
//	Chapter 4, P297_3
//  Operators

class Tester297_3 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        if (nums instanceof Object) {
            System.out.println("nums instanceof Object");
        }     //  result is true
    }
}

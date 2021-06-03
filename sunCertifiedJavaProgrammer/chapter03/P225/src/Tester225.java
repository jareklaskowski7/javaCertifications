//	Sun Certified Java Programmer
//	Chapter 3, P225
//  Assignments

class Tester225 {
    public static void main(String[] args) {
        int[] x = new int[5];
        x[4] = 2;           //  OK, the last element is at index 4
        x[5] = 3;           //  Runtime exception.  There is no element at index 5!*/

        int[] z = new int[2];
        int y = -3;
        z[y] = 4;           //  Runtime exception.  y is a negative number
    }
}

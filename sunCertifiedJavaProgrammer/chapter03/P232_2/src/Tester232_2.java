//	Sun Certified Java Programmer
//	Chapter 3, P232_2
//  Assignments

class Tester232_2 {
    public static void main(String[] args) {
        int[] splats;
        int[] dats = new int[4];
        char[] letters = new char[5];
        splats = dats;      //  OK, dats refers to an int array
        splats = letters;   //  NOT OK, letters refers to a char array
    }
}

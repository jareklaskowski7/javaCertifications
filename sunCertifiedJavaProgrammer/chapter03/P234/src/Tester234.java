//	Sun Certified Java Programmer
//	Chapter 3, P234
//  Assignments

class Tester234 {
    public static void main(String[] args) {
        int[] blots;
        int[][] squeegees = new int[3][];
        blots = squeegees;      //  NOT OK, squeegees is a
        //  two-d array of int arrays
        int[] blocks = new int[6];
        blots = blocks;         //  OK, blocks is an int array

        int[][] books = new int[3][];
        int[] numbers = new int[6];
        int aNumber = 7;
        books[0] = aNumber;     //  NO, expecting an int array not an int
        books[0] = numbers;     //  OK, numbers is an int array
    }
}

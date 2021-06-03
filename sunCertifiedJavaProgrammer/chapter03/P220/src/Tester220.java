//	Sun Certified Java Programmer
//	Chapter 3, P220
//  Assignments

class Tester220 {
    public static void main(String[] args) {
        // P220
        int[] key;     //  brackets before name (recommended)
        int key2[];     //  brackets after name (legal but less readable)
        //  spaces between the name and [] legal, but bad

        Thread[] threads;   //  Recommended
        Thread threads2[];   //  Legal but less readable

        String[][][] occupantName;  //  recommended
        String[] ManagerName[];    //  yucky, but legal

        int[5]scores;              //  it is not legal to include the size
        //  of the array in the declaration

        //  P221
        int[] testScores;           //  Declares the array of ints
        testScores = new int[4];    //  constructs an array and assigns it
        //  to the testScores variable

        int[] testScores = new int[4];
        Thread[] threads = new Thread[5];

        //  P222
        int[] carList = new int[];  //  Will not compile; needs a size
    }
}

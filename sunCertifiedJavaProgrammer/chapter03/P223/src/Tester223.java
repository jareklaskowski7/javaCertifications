//	Sun Certified Java Programmer
//	Chapter 3, P223
//  Assignments

class Tester223 {
    public static void main(String[] args) {
        int[][] myArray = new int[3][1];
        myArray[0] = new int[2];
        myArray[0][0] = 6;
        myArray[0][1] = 7;
        System.out.println("myArray[0][0] = " + myArray[0][0]);
        System.out.println("myArray[0][1] = " + myArray[0][1]);
        myArray[1] = new int[3];
        myArray[1][0] = 9;
        myArray[1][1] = 8;
        myArray[1][2] = 5;
        System.out.println("myArray[1][0] = " + myArray[1][0]);
        System.out.println("myArray[1][1] = " + myArray[1][1]);
        System.out.println("myArray[1][2] = " + myArray[1][2]);
        
        /*System.out.println("myArray[2][0] = " + myArray[2][0]);
        System.out.println("myArray[2][1] = " + myArray[2][1]);
        System.out.println("myArray[2][2] = " + myArray[2][2]);
        System.out.println("myArray[2][3] = " + myArray[2][3]);*/
    }
}

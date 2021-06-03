//	Sun Certified Java Programmer
//	Chapter 3, P231
//  Assignments

class Tester231 {
    public static void main(String[] args) {
        int[] weightList = new int[5];
        byte b = 4;
        char c = 'c';
        short s = 7;
        weightList[0] = b;  //  OK, byte is smaller than int
        weightList[1] = c;  //  OK, char is smaller than int
        weightList[2] = s;  //  OK, short is smaller than int
        for (int i = 0; i < weightList.length; i++) {
            System.out.println("weightList[" + i + "] = " + weightList[i]);
        }
    }
}

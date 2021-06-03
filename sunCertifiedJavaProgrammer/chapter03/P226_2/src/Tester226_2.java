//	Sun Certified Java Programmer
//	Chapter 3, P226_2
//  Assignments

class Tester226_2 {
    public static void main(String[] args) {
        int x = 9;
        int[] dots = {6, x, 8};
        for (int i = 0; i < dots.length; i++) {
            System.out.println("dots[" + i + "] = " + dots[i]);
        }
        int[] dats;
        dats = new int[3];
        int y = 9;
        dats[0] = 6;
        dats[1] = y;
        dats[2] = 8;
        for (int j = 0; j < dats.length; j++) {
            System.out.println("dats[" + j + "] = " + dats[j]);
        }
    }
}

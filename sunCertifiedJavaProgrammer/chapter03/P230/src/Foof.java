//	Sun Certified Java Programmer
//	Chapter 3, P230
//  Assignments

public class Foof {
    void takesAnArray(int[] someArray) {
        //  use the array parameter
    }

    public static void main(String[] args) {
        Foof f = new Foof();
        f.takesAnArray(new int[]{7, 7, 8, 2, 5});  //  we need an array argument

        //new Object[3] {null, new Object(), new Object()};
        //  not legal; size must not be specified
    }
}

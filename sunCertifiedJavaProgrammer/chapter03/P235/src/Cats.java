//	Sun Certified Java Programmer
//	Chapter 3, P235
//  Assignments

public class Cats {
    public static void main(String[] args) {
        // Illegal Array Reference Assignments

        //  A
        myCats = myCats[0];
        //  Can't assign a 1-D array to a 2-D array reference

        //  B
        myCats = myCats[0][0];
        //  Can't assign a nonarray object to a 2-D array reference

        //  C
        myCats[1] = myCats[1][2];
        //  Can't assign a nonarray object to a 1-D array reference

        //  D
        myCats[0][1] = moreCats;
        //  Can't assign an array object to a nonarray reference
        //  myCats[0][1] can only refer to a Cat object
    }
}

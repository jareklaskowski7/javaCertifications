//	Sun Certified Java Programmer
//	Chapter 7, P555
//  Generics and Collections

import java.io.*;

class SaveMe implements Serializable{
    transient int x;
    int y;
     SaveMe(int xVal, int yVal) {
        x = xVal;
        y = yVal;
    }
    public int hashCode() {
        return (x ^ y);     //  Legal, but not correct to
                            //  use transient variable
    }
    public boolean equals(Object o) {
        SaveMe test = (SaveMe)o;
        if (test.y == y && test.x == x) {   //  Legal, not correct
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args)
    {
    	SaveMe sm = new SaveMe(5, 7);
    	System.out.println(sm);
    }
}

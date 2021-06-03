//	Sun Certified Java Programmer
//	Chapter 3, P260
//  Assignments

public class Island {
    Island n;

    public static void main(String[] args) {
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();
        i2.n = i3;
        i3.n = i4;
        i4.n = i2;
        i2 = null;
        i3 = null;
        i4 = null;
        //doComplexStuff();
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}

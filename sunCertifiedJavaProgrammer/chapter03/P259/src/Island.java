//	Sun Certified Java Programmer
//	Chapter 3, P259
//  Assignments

public class Island {
    Island i;

    public static void main(String[] args) {
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();

        i2.i = i3;      //  i2 refers to i3
        i3.i = i4;      //  i3 refers to i4
        i4.i = i2;      //  i4 refers to i2

        i2 = null;
        i3 = null;
        i4 = null;

        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        //  do complicated, memory intensive stuff
    }
}

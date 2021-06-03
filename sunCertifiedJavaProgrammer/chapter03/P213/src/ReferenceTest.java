//	Sun Certified Java Programmer
//	Chapter 3, P213
//  Assignments

import java.awt.Dimension;

class ReferenceTest {
    public static void main(String[] args) {
        Dimension d = new Dimension(5, 10);
        ReferenceTest rt = new ReferenceTest();
        System.out.println("Before modify() d.height = "
                + d.height);
        rt.modify(d);
        System.out.println("After modify() d.height = "
                + d.height);
        System.out.println("d = " + d.height);
    }

    void modify(Dimension dim) {
        dim.height = dim.height + 1;
        System.out.println("dim = " + dim.height);
    }
}

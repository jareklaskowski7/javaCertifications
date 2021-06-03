//	Sun Certified Java Programmer
//	Chapter 2, P90
//  Object Orientation

class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        if (!t1.equals(t2))
            System.out.println("they're not equal");
        if (t1 instanceof Object)
            System.out.println("t1's an Object");
        //  I modified it (Jarek)
        if (t2 instanceof Object)
            System.out.println("t2's an Object");
    }
}

//	Sun Certified Java Programmer
//	Chapter 3, P251_2
//  Assignments

class Dog4 {
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.test(new Integer(5));     //  can't widen an Integer
        //  to a Long
    }

    void test(Long x) {
    }
}

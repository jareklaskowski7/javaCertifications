//	Sun Certified Java Programmer
//	Chapter 3, P247
//  Assignments

class Boxing2 {
    static Integer x;

    public static void main(String[] args) {
        doStuff(x);
        System.out.println(x);
    }

    static void doStuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z);
    }
}

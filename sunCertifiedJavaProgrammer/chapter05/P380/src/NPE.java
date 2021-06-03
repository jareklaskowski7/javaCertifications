//	Sun Certified Java Programmer
//	Chapter 5, P380
//  Flow Control, Exceptions, and Assertions

class NPE {
    static String s;

    public static void main(String[] args) {
        System.out.println(s.length());
    }

    void go() {     //  recursion gone bad
        go();
    }
}

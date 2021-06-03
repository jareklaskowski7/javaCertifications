//	Sun Certified Java Programmer
//	Chapter 2, P167
package self_test_11;

public class SubSubAlpha extends Alpha {
    private SubSubAlpha() { s += "subsub "; }
    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
}
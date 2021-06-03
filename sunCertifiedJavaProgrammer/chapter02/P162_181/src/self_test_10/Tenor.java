//	Sun Certified Java Programmer
//	Chapter 2, P166
package self_test_10;

public class Tenor extends Singer {
    public static String sing() { return "fa"; }
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }
}
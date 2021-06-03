//	Sun Certified Java Programmer
//	Chapter 2, P167
package self_test_12;

public class House extends Building {
    House() { System.out.print("h "); }
    House(String name) {
        this();     System.out.print("hn " + name);
    }
    public static void main(String[] args) { new House("x "); }
}
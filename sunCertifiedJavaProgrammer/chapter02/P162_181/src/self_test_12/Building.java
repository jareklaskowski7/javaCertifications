//	Sun Certified Java Programmer
//	Chapter 2, P167
package self_test_12;

class Building {
    Building() { System.out.print("b "); }
    Building(String name) {
        this();     System.out.print("bn " + name);
    }
}
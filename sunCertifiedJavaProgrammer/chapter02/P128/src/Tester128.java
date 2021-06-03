//	Sun Certified Java Programmer
//	Chapter 2, P128
//  Object Orientation

public class Tester128 {
    //  1
    public Button doStuff() {
        return null;
    }

    //  2
    public String[] go() {
        return new String[]{"Fred", "Barney", "Wilma"};
    }

    //  3
    public int foo1() {
        char c = 'c';
        return c;   //  char is compatible with int
    }

    //  4
    public int foo2() {
        float f = 32.5f;
        return (int) f;
    }

    //  5
    public void bar() {
        return "this is it";    //  Not legal!
    }

    public static void main(String[] args) {
    }
}

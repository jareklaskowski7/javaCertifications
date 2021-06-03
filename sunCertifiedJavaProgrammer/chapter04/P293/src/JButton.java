//	Sun Certified Java Programmer
//	Chapter 4, P293
//  Operators

class JButton {
    String label;
    static boolean k;

    JButton(String s) {
        label = s;
        k = false;
    }

    public static void main(String[] args) {
        JButton a = new JButton("Exit");
        JButton b = a;
        System.out.println("a.label = " + a.label);
        System.out.println("b.label = " + b.label);
        System.out.println("a.toString() = " + a.toString());
        System.out.println("b.toString() = " + b.toString());
        if (a == b) {
            k = true;
            System.out.println("References a and b refer to the same object");
        }
        System.out.println("Is reference a == b? " + (a == b));
    }
}

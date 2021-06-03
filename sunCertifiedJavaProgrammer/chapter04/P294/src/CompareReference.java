//	Sun Certified Java Programmer
//	Chapter 4, P294
//  Operators

import javax.swing.JButton;

class CompareReference {
    public static void main(String[] args) {
        JButton a = new JButton("Exit");
        JButton b = new JButton("Exit");
        JButton c = a;
        System.out.println("Is reference a == b? " + (a == b));
        System.out.println("Is reference a == c? " + (a == c));
        System.out.println("Is reference b == c? " + (b == c));
    }
}

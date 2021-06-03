//	Sun Certified Java Programmer
//	Chapter 8; P676_2
//  Inner Classes

class Food {
    Popcorn p = new Popcorn() {
        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };

    public void popIt() {
        p.pop();        //  OK, Popcorn has a pop() method
        p.sizzle();     //  Not Legal!  Popcorn does not have sizzle()
    }
}

//	Sun Certified Java Programmer
//	Chapter 8; P673
//  Inner Classes

class Food {
    Popcorn p = new Popcorn() {
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
}

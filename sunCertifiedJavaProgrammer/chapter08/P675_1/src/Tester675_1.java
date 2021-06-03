//	Sun Certified Java Programmer
//	Chapter 8; P675_1
//  Inner Classes

public class Tester675_1 {
    public static void main(String[] args) {
        Popcorn p = new Popcorn() {
            public void pop() {
                System.out.println("anonymous popcorn");
            }
        }   //  Missing the semicolon needed to end
            //  the statement started on 2! (line 6)
        Foo f = new Foo();
    }
}

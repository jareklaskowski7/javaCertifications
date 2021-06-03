//	Sun Certified Java Programmer
//	Chapter 8; P670_1
//  Inner Classes

class MyOuter2 {
    private String x = "Outer2";

    void doStuff() {
        class MyInner {
            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }   //  close inner class method
        }   //  close inner class definition
    }   //  close outer class method doStuff()

}   //  close outer class

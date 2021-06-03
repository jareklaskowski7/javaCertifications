//	Sun Certified Java Programmer
//	Chapter 8; P671
//  Inner Classes

class MyOuter2 {
    private String x = "Outer2";
    void doStuff() {
        class MyInner {
            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }   //  close inner class method
        }   //  close inner class definition

        MyInner mi = new MyInner();         //  This line must come
                                            //  after the class
        mi.seeOuter();
    }   //  close outer class method doStuff()
}   //  close outer class

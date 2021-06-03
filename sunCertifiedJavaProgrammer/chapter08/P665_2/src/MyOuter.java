//	Sun Certified Java Programmer
//	Chapter 8; P665_2
//  Inner Classes

class MyOuter {
    private int x = 7;

    //  inner class definition
    class MyInner {
        public void seeOuter() {
            System.out.println("Outer x is " + x);
        }
    }   //  close inner class definition
}   //  close outer class

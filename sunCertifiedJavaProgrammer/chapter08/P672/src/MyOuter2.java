//	Sun Certified Java Programmer
//	Chapter 8; P672
//  Inner Classes

class MyOuter2 {
    private String x = "Outer2";
    void doStuff() {
        String z = "local variable";
        class MyInner {
            public void seeOuter() {
                System.out.println("Outer x is " + x);
                System.out.println("Local variable z is " + z); //  Won't Compile!
            }   //  close inner class method
        }   //  close inner class definition
    }   //  close outer class method doStuff()
}   //  close outer class

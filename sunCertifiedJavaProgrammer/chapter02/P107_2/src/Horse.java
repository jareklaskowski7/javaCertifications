//	Sun Certified Java Programmer
//	Chapter 2, P107_2
//  Object Orientation

class Horse extends Animal {
    public void printYourself() {
        //  Take advantage of Animal code, then add some more
        super.printYourself();  //  Invoke the superclass
        //  (Animal) code
        //  Then do Horse-specific
        //  print work here
    }
}

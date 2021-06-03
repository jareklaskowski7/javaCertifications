//	Sun Certified Java Programmer
//	Chapter 2, P109
//  Object Orientation

class Horse extends Animal {
    //private void eat() { }          //  Access modifier is more restrictive

    //public void eat() throws IOException { }    //  Declares a checked
    //  exception not defined by superclass version

    //public void eat(String food) { }    //  A legal overload, not an override,
    //  because the argument list changed

    public String eat() {
    }     //  Not an override because of the return type,
    //  not an overload either because there's no change in the argument list
}

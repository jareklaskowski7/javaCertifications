//	Sun Certified Java Programmer
//	Chapter 2, P139
//  Object Orientation

class TShirt extends Clothing {
    //  Constructor identical to compiler-supplied default constructor
    TShirt() {
        super();    //  Won't work!
        //  Invokes a no-arg Clothing() constructor,
        //  but there isn't one!
    }
}

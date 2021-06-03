//	Sun Certified Java Programmer
//	Chapter 2, P104
//  Object Orientation

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse(); //  Animal ref, but a Horse object
        a.eat();    //  Runs the Animal version of eat()
        b.eat();    //  Runs the Horse version of eat()
        //  The following is not legal:
        Animal c = new Horse();
        c.buck();   //  Can't invoke buck();
        //  Animal class doesn't have that method
    }
}

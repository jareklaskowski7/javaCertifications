//	Sun Certified Java Programmer
//	Chapter 2, P108
//  Object Orientation

class Dog2 extends Animal {
    public void eat() { /*no Exceptions */}

    public static void main(String[] args) {
        Animal a = new Dog2();
        Dog2 d = new Dog2();
        d.eat();    //  ok
        a.eat();    //  compiler error -
        //  unreported exceptions
    }
}

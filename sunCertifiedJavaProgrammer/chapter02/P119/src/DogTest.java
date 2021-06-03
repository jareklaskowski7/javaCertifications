//	Sun Certified Java Programmer
//	Chapter 2, P119
//  Object Orientation

class DogTest {
    public static void main(String[] args) {
        //Animal a = new Dog();
        //Dog d = (Dog) a;
        //d.doDogStuff();

        Animal a = new Dog();
        ((Dog) a).doDogStuff();
    }
}

//	Sun Certified Java Programmer
//	Chapter 2, P117_2
//  Object Orientation

class DogTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog d = (Dog) animal;   //  compiles but fails later
    }
}

//	Sun Certified Java Programmer
//	Chapter 2, P118_2
//  Object Orientation

class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;          //  upcast ok with no explicit cast
        Animal a2 = (Animal) d; //  upcast ok with an explicit cast
    }
}

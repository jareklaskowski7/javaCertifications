//	Sun Certified Java Programmer
//	Chapter 2, P118
//  Object Orientation

class DogTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog d = (Dog) animal;
        String s = (String) animal; //  animal can't EVER be a String
    }
}

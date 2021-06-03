//	Sun Certified Java Programmer
//	Chapter 2, P116
//  Object Orientation

class CastTest2 {
    public static void main(String[] args) {
        //Animal animal = new Dog();
        Animal[] a = {new Animal(), new Dog(), new Animal()};
        for (Animal animal : a) {
            animal.makeNoise();
            if (animal instanceof Dog) {
                animal.playDead();  //  try to do a Dog behavior ?
            }
        }
    }
}

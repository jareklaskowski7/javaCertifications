//	Sun Certified Java Programmer
//	Chapter 7, P627_1
//  Generics and Collections

public class AnimalHolder<T extends Animal> {       //  use "T" instead
    //  of "?"
    T animal;

    public static void main(String[] args) {
        AnimalHolder<Dog> dogHolder = new AnimalHolder<Dog>();      //  OK
        AnimalHolder<Integer> x = new AnimalHolder<Integer>();      //  NO!
    }
}

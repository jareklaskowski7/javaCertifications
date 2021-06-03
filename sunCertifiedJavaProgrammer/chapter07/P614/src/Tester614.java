//	Sun Certified Java Programmer
//	Chapter 7, P614
//  Generics and Collections

import java.util.*;

public class Tester614 {
    public void addAnimal(Animal[] animals) {
        animals[0] = new Dog();         //  no problem, any Animal works
        //  in Animal[]
    }

    public void addAnimal(ArrayList<Animal> animals) {
        animals.add(new Dog());         //  sometimes allowed...
    }

    public void foo() {
        Dog[] dogs = {new Dog(), new Dog()};
        addAnimal(dogs);                //  no problem, send the Dog[] to the method
    }

    public void addAnimal(Animal[] animals) {
        animals[0] = new Dog();         //  ok, any Animal subtype works
    }

    //  P615
    public void foo() {
        Cat[] cats = {new Cat(), new Cat()};
        addAnimal(cats);                //  no problem, send the Cat[] to the method
    }

    public void addAnimal(Animal[] animals) {
        animals[0] = new Dog();         //  Eeek!  We just put a Dog
        //  in a Cat array!
    }

    public static void main(String[] args) {
    }
}

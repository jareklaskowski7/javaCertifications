//	Sun Certified Java Programmer
//	Chapter 7, P616
//  Generics and Collections

import java.util.*;

public class Tester616 {
    public void addAnimal(List<Animal> animals) {
        animals.add(new Dog());     //  this is always legal,
        //  since Dog can
        //  be assigned to an Animal
        //  reference
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        doc.addAnimal(animals);     //  OK, since animals matches
        //  the method arg
    }
}

    //  P616_2
    public void addAnimal(List<Animal> animals) {
        animals.add(new Dog());         //  still OK as always
    }

    public static void main(String[] args) {
        List<Dog> animals = new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new Dog());
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        doc.addAnimal(animals);     //  THIS is where it breaks!
    }

    //  P617
    public void addAnimal(List<Animal> animals)

//  or

    public void addAnimal(List<? extends Animal> animals)

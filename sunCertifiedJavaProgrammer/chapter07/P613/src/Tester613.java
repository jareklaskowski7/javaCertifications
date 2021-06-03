//	Sun Certified Java Programmer
//	Chapter 7, P613
//  Generics and Collections

import java.util.*;

public class Tester613 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();

        /*List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());         //  OK
        animals.add(new Dog());         //  OK*/
    }
}

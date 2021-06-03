//	Sun Certified Java Programmer
//	Chapter 7, P619
//  Generics and Collections

public class Tester619 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
        doc.addAnimal(animals);         //  passing an Animal List
    }
}

    public void foo(List<?> list) {
    }

    public void foo(List<Object> list) {
    }

//	Sun Certified Java Programmer
//	Chapter 2, P112
//  Object Orientation

class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("In the Animal version");
    }

    public void doStuff(Horse h) {
        System.out.println("In the Horse version");
    }

    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        Animal animalObj = new Animal();
        Horse horseObj = new Horse();
        ua.doStuff(animalObj);
        ua.doStuff(horseObj);
    }
}

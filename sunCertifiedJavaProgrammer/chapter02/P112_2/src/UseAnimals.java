//	Sun Certified Java Programmer
//	Chapter 2, P112_2
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
        //  Animal reference to a Horse object
        Animal animalRefToHorse = new Horse();
        ua.doStuff(animalRefToHorse);
    }
}

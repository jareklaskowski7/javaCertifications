//	Sun Certified Java Programmer
//	Chapter 2, P151
//  Object Orientation

class Dog extends Animal {
    static void doStuff() {   //  it's a redefinition, not an override
        // System.out.print("d ");
    }

    public static void main(String[] args) {
        Animal[] a = {new Animal(), new Dog(), new Animal()};
        for (int x = 0; x < a.length; x++) {
            a[x].doStuff();  // invoke the static method
        }
    }
}

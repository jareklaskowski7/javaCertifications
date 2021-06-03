//	Sun Certified Java Programmer
//	Chapter 3, P251
//  Assignments

class Dog3 extends Animal {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.go(d);        //  is it legal ?
    }

    void go(Animal a) {
    }
}

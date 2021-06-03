//	Sun Certified Java Programmer
//	Chapter 8; P675_676
//  Inner Classes

class Test {
    public static void main(String[] args) {
        Animal h = new Horse();
        h.eat();    //  Legal, class Animal has an eat() method
        h.buck();   //  Not legal!  Class Animal doesn't have buck()
    }
}

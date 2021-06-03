//	Sun Certified Java Programmer
//	Chapter 1, P75_4
//  Declarations and Access Control

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animals(String s) {
        sound = s;
    }

    //  A is correct
}

//	Sun Certified Java Programmer
//	Chapter 2, P165
package self_test_8;

public class DogShow
{
    public static void main(String[] args) { new DogShow().go(); }
    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        ((Dog) new Hound()).sniff();
    }
}
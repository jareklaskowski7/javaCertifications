//	Sun Certified Java Programmer
//	Chapter 7, P618
//  Generics and Collections

public class Tester618 {
    public void addAnimal(List<? extends Animal> animals) {
        animals.add(new Dog());         //  NO!  Can't add if we
        //  use <? extends Animal>
    }

    void foo(List<? extends Serializable> list)     //  odd, but correct

    //  to use "extends"
    public static void main(String[] args) {
        //
    }
}

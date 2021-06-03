//	Sun Certified Java Programmer
//	Chapter 2, P129
//  Object Orientation

public class Tester129 {
    public Animal getAnimal() {
        return new Horse();     //  Assume Horse extends Animal
    }

    public Object getObject() {
        int[] nums = {1, 2, 3};
        return nums;         //  Return an int array,
        //  which is still an object
    }

    public static void main(String[] args) {
    }
}

//	Sun Certified Java Programmer
//	Chapter 3, P226
//  Assignments

class Tester226 {
    public static void main(String[] args) {
        Dog[] myDogs = new Dog[6];     //  creates an array of 6
        //  Dog references
        for (int x = 0; x < myDogs.length; x++) {
            myDogs[x] = new Dog();      //  assign a new Dog to the
            //  index position x
            System.out.println(myDogs[x]);
        }
    }
}

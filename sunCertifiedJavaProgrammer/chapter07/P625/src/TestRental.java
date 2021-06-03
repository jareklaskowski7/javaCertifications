//	Sun Certified Java Programmer
//	Chapter 7, P625
//  Generics and Collections

import java.util.*;

class TestRental {
    public static void main(String[] args) {
        // make some Cars for the pool
        Car c1 = new Car();
        Car c2 = new Car();
        List<Car> carList = new ArrayList<Car>();
        carList.add(c1);
        carList.add(c2);
        RentalGeneric<Car> carRental = new
                RentalGeneric<Car>(2, carList);
        //  now get a car out, and it won't need a cast
        Car carToRent = carRental.getRental();
        carRental.returnRental(carToRent);
        //  can we stick something else in the original carList?
        carList.add(new Cat("Fluffy"));
    }
}

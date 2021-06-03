//	Sun Certified Java Programmer
//	Chapter 7, P623
//  Generics and Collections

import java.util.*;

public class CarRental extends Rental {
    public CarRental(int maxNum, List<Car> rentalPool) {
        super(maxNum, rentalPool);
    }

    public Car getRental() {
        return (Car) super.getRental();
    }

    public void returnRental(Car c) {
        super.returnRental(c);
    }

    public void returnRental(Object o) {
        if (o instanceof Car) {
            super.returnRental(o);
        } else {
            System.out.println("Cannot add a non-Car");
            //  possibly throw an exception
        }
    }
}

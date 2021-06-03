//	Sun Certified Java Programmer
//	Chapter 3, P233
//  Assignments

class Tester233 {
    public static void main(String[] args) {
        Car[] cars;
        Honda[] cuteCars = new Honda[5];
        cars = cuteCars;    //  OK because Honda is a type of Car
        Beer[] beers = new Beer[99];
        cars = beers;   //  NOT OK, Beer is not a type of Car

        Foldable[] foldingThings;
        Box[] boxThings = new Box[3];
        foldingThings = boxThings;
        //  OK, Box implements Foldable, so Box IS-A Foldable
    }
}

//	Sun Certified Java Programmer
//	Chapter 3, P231_3
//  Assignments

class TestSportyThings {
    public static void main(String[] args) {
        Sporty[] sportyThings = new Sporty[3];
        sportyThings[0] = new Ferrari();        //  OK, Ferrari
        //  implements Sporty
        sportyThings[1] = new RacingFlats();    //  OK, RacingFlats
        //  implements Sporty
        sportyThings[2] = new GolfClub();

        //  Not OK, GolfClub does not implement Sporty
        //  I don't care what anyone says
    }
}

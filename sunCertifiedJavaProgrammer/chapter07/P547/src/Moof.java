//	Sun Certified Java Programmer
//	Chapter 7, P547
//  Generics and Collections

class Moof {
    private int moofValue;
    Moof(int val) {
        moofValue = val;
    }
    public int getMoofValue() {
        return moofValue;
    }
    public boolean equals(Object o) {
    	//  if ((o instanceof Moof) && (((Moof)o).getMoofValue() == this.moofValue)) {
        if (((Moof)o).getMoofValue() == this.moofValue) {
        	//  the preceding line compiles, but it's BAD!
            return true;
        } else {
            return false;
        }
    }

    //  If the object does not pass the instanceof test, then you'll
    //  get a runtime ClassCastException
}

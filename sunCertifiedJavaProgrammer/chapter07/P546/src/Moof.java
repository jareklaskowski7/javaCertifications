//	Sun Certified Java Programmer
//	Chapter 7, P546
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
        if ((o instanceof Moof) && (((Moof)o).getMoofValue() == this.moofValue)) {
            return true;
        } else {
            return false;
        }
    }
    //  If the object does not pass the instanceof test, then you'll
    //  get a runtime ClassCastException
}

//	Sun Certified Java Programmer
//	Chapter 7, P553
//  Generics and Collections

class HasHash {
    public int x;
    HasHash(int xVal) { x = xVal; }
    
    public boolean equals(Object o) {
        HasHash h = (HasHash) o;    //  Don't try at home without
                                    //  instanceof test
        if (h.x == this.x) {
            return true;
        } else {
            return false;
        }
    }
    public int hashCode() { return 1492; }
    
    public static void main(String[] args) {
    	HasHash h = new HasHash(9);
    	System.out.println(h);
    }
}

//	Sun Certified Java Programmer
//	Chapter 1, P55_3
//  Declarations and Access Control

class Foo {
    int size = 27;

    public void setSize(int size) {
        this.size = size;   // this.size means the current object's instance variable, size.
                            // The size on the right is the parameter
    }
}

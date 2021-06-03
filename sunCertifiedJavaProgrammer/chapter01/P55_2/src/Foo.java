//	Sun Certified Java Programmer
//	Chapter 1, P55_2
//  Declarations and Access Control

class Foo {
    int size = 27;

    public void setSize(int size) {
        size = size; // ??? which size equals which size???
    }
}

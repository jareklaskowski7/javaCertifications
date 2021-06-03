//	Sun Certified Java Programmer
//	Chapter 3, P201
//  Assignments

class ScopeErrors {
    int x = 5;

    public static void main(String[] args) {
        x++;    //  won't compile, x is an 'instance' variable
    }
}

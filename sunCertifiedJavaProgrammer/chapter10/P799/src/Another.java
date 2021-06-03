//	Sun Certified Java Programmer
//	Chapter 10; P799
//  Development

import com.foo.MyClass;  // either import will work
//import com.foo.*;

public class Another {
    void go() {
        MyClass m1 = new MyClass();                 // alias name
        com.foo.MyClass m2 = new com.foo.MyClass(); // full name
        m1.hi();
        m2.hi();
    }
}

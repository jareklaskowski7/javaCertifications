//	Sun Certified Java Programmer
//	Chapter 1, P34_35
//  Declarations and Access Control

package other;  //  Different package

import certification.Parent;

class Child extends Parent {
    public void testIt() {
        System.out.println("x is " + x);    //  No problem; Child inherits x
    }
}

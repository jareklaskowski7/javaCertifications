//	Sun Certified Java Programmer
//	Chapter 1, P35_2
//  Declarations and Access Control

package other;  //  Different package

import certification.Parent;

class Child extends Parent {
    public void testIt() {
        System.out.println("x is " + x);    //  No problem; Child
        //  inherits x
        Parent p = new Parent();    //  Can we access x using the p reference?
        System.out.println("X in parent is " + p.x);    //  Compiler error!
    }
}

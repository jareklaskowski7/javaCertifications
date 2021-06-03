//	Sun Certified Java Programmer
//	Chapter 1, P30
//  Declarations and Access Control

package noncert;

import cert.Roo;

class UseARoo {
    public void testIt() {
        Roo r = new Roo();  //So far so good; class Roo is public
        System.out.println(r.doRooThings());  //Compiler error!
    }
}

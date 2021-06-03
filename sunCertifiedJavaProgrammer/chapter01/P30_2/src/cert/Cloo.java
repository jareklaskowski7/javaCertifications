//	Sun Certified Java Programmer
//	Chapter 1, P31
//  Declarations and Access Control

package cert;    //Cloo and Roo are in the same package

class Cloo extends Roo  //Still OK, superclass Roo is public
{
    public void testCloo() {
        System.out.println(doRooThings());  //Compiler error!
    }
}

//	Sun Certified Java Programmer
//	Chapter 1, P38
//  Declarations and Access Control

package certification;

class Child extends Parent {
    static public void main(String[] args) {
        Child sc = new Child();
        sc.testIt();
    }

    public void testIt() {
        System.out.println("Variable x is " + x);   //  No problem;
    }
}

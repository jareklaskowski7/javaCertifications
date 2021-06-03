//	Sun Certified Java Programmer
//	Chapter 2, P111
//  Object Orientation

//  From another class, invoke the addThem() method
public class TestAdder {
    public static void main(String[] args) {
        Adder a = new Adder();
        int b = 27;
        int c = 3;
        int result = a.addThem(b, c);   //  Which addThem is invoked?
        double doubleResult = a.addThem(22.5, 9.3);     //  Which addThem?

        //  I modified the code here: (Jarek)
        System.out.println("result " + result);
        System.out.println("doubleResult " + doubleResult);
    }
}

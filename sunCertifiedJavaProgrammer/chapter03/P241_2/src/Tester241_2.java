//	Sun Certified Java Programmer
//	Chapter 3, P241_2
//  Assignments

class Tester241_2 {
    public static void main(String[] args) {
        double d4 = Double.parseDouble("3.14");     //  convert a String
        //  to a primitive
        System.out.println("d4 = " + d4);           //  result is d4 = 3.14

        Double d5 = Double.valueOf("3.14");         //  create a Double obj
        System.out.println(d5 instanceof Double);   //  result is "true"

        //  The next examples involve using the radix argument(in this case binary):

        long L2 = Long.parseLong("101010", 2);      //  binary String to a
        //  primitive
        System.out.println("L2 = " + L2);           //  result is L2 = 42

        Long L3 = Long.valueOf("101010", 2);        //  binary String to
        //  Long object
        System.out.println("L3 value = " + L3);     //  result is:
        //  L3 value = 42
    }
}

//	Sun Certified Java Programmer
//	Chapter 3, P242
//  Assignments

class Tester242 {
    public static void main(String[] args) {
        Integer i1 = new Integer("5");
        System.out.println(i1);
        System.out.println("i1 = " + i1.toString());
        String i2 = Integer.toString(6);
        System.out.println("i2 = " + i2);
        Double d1 = new Double("3.14");
        System.out.println("d1 = " + d1.toString());      //  result is d1 = 3.14
        String d2 = Double.toString(3.14);               //  d2 = "3.14"
        System.out.println("d2 = " + d2);

        String s = "hex = " + Long.toString(254, 16);    //  s = "hex = fe"
        System.out.println(s);

        String s3 = Integer.toHexString(254);           //  convert 254 to hex
        System.out.println("254 is " + s3);             //  result: "254 is fe"

        String s4 = Long.toOctalString(254);            //  convert 254 to octal
        System.out.print("254(oct) =" + s4);             //  result: "254(oct) =376"
    }
}

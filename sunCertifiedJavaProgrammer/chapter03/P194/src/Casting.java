//	Sun Certified Java Programmer
//	Chapter 3, P194
//  Assignments

class Casting {
    public static void main(String[] args) {
        //int x = 3957.229;   //  illegal

        //int x = (int)3957.229;  //  legal cast
        //System.out.println("int x = " + x);

        //long l = 56L;
        //byte b = (byte)l;
        //System.out.println("The byte is " + b);

        long l = 130L;
        byte b = (byte) l;
        long l1 = 131L;
        byte b1 = (byte) l;
        System.out.println("The byte is " + b);
        System.out.println("The byte is " + b1);
    }
}

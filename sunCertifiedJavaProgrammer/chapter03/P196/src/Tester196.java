//	Sun Certified Java Programmer
//	Chapter 3, P196
//  Assignments

class Tester196 {
    public static void main(String[] args) {
        //  P196
        /*/  Assigning Floating-Point Numbers
        float f2 = 32.3;

        float f = (float) 32.3;
        float g = 32.3f;
        float h = 32.3F;*/

        //  Assigning a Literal That Is Too Large for the Variable
        //byte a1 = 128;       //  byte can only hold up to 127
        byte a2 = (byte) 128;
        System.out.println("The value of a2 is " + a2);

        //  P197
        byte b2 = 3;
        b2 += 7;             //  No problem - adds 7 to b (result is 10)
        System.out.println("The value of b2 is   " + b2);

        byte b3 = 3;
        b3 = (byte) (b3 + 7); //  Won't compile without the
        //  cast, since b + 7 results in an int*/
        System.out.println("The value of b3 is   " + b3);
    }
}

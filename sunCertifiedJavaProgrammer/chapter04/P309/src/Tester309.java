//	Sun Certified Java Programmer
//	Chapter 4, P309
//  Operators

class Tester309 {
    public static void main(String[] args) {
        int z = 5;
        if (++z > 5 || ++z > 6) z++;     //  z = 7 after this code
        System.out.println(z);

        //  versus:
        //int z = 5;
        if (++z > 5 | ++z > 6) z++;     //  z = 8 after this code
        System.out.println(z);

        System.out.println("xor " + ((2 < 3) ^ (4 > 3)));
        if (!(7 == 5)) {
            System.out.println("not equal");
        }
    }
}

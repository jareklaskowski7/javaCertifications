//	Sun Certified Java Programmer
//	Chapter 3, P188_190
//  Assignments

class Tester188_190 {
    public static void main(String[] args) {
        //  P188
        long jo = 110599L;
        long so = 0xFFFFl;  //  Note the lowercase 'l'

        //  P188
        //  Floating-Point Literals
        double d1 = 11301874.9881024;
        float f = 23.467890;        //  Compiler error, possible loss of precision
        float g1 = 49837849.029847F; //  OK, has the suffix "F"
        double d2 = 110599.995011D;  //  Optional, not required
        double g2 = 987.897;         //  No, 'D' suffix, but OK because
        //  literal is a double by default
        // P189
        int x = 25, 343;             //  Won't compile because of the comma

        //  Boolean Literals
        boolean t = true;           //  Legal
        boolean f = 0;              //  Compiler error!
        int x = 1;
        if (x) {
        }      //  Compiler error!

        //  Character Literals
        char a1 = 'a';
        char b1 = '@';
        char letterN = '\u004E';    //  The letter 'N'

        char a2 = 0x892;            //  hexadecimal literal
        char b2 = 982;              //  int literal
        char c2 = (char) 70000;      //  The cast is required, 70000 is
        //  out of char range
        //  P190
        char d3 = (char) -98;       //  Ridiculous, but legal
        char e = -29;               //  Possible loss of precision; needs a cast
        char f = 70000;             //  Possible loss of precision; needs a cast
        char c3 = '\"';             //  A double quote
        char d4 = '\n';             //  A newline

        //  Literal Values for Strings
        String s = "Bill Joy";
        System.out.println("Bill" + " Joy");
        Thread t =???              //  what literal value could possibly go here?*/
    }
}

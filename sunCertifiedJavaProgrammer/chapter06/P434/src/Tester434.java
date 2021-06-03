//	Sun Certified Java Programmer
//	Chapter 6, P434
//  Strings, I/O, Formatting, and Parsing

class Tester434 {
    public static void main(String[] args) {
        //  P434
        String s1 = "abc";                   //  creates one String object and one
        System.out.println(s1);              //  reference variable
        String s2 = new String("abc");     //  creates two objects,
        System.out.println(s2);            //  and one reference variable

        //  P435
        //  public char charAt(int index)
        String x1 = "airplane";
        System.out.println(x1.charAt(2));      //  output is 'r'

        //  public String concat(String s)
        String x2 = "taxi";
        System.out.println(x2.concat(" cab")); //  output is "taxi cab"

        //  The overloaded + and += perform functions similar to the concat()
        //  method - for example,
        String x3 = "library";
        System.out.println(x3 + " card");       //  output is "library card"
        String x4 = "Atlantic";
        x4 += " ocean";
        System.out.println(x4);                //  output is "Atlantic ocean"

        //  P436
        //  public boolean equalsIgnoreCase(String s)
        String x5 = "Exit";
        System.out.println(x5.equalsIgnoreCase("EXIT"));    //  is "true"
        System.out.println(x5.equalsIgnoreCase("tixe"));    //  is "false"

        //  public int length()
        String x6 = "01234567";
        System.out.println(x6.length());   //  returns "8"

        //  public String replace(char old, char new)
        String x7 = "oxoxoxox";
        System.out.println(x7.replace('x', 'X'));      //  output is
        //  "oXoXoXoX"
        //  P437
        //  Exam watch!
        /*String x1 = "test";
        System.out.println( x1.length );     //  compiler error
        //  or
        String[] x2 = new String[3];
        System.out.println( x2.length() );*/   //  compiler error

        //  public String substring(int begin)
        //  public String substring(int begin, int end)
        String x8 = "0123456789";           //  as if by magic, the value
        //  of each char
        //  is the same as its index!
        System.out.println(x8.substring(5));       //  output is "56789"
        System.out.println(x8.substring(5, 8));     //  output is "567"

        //  public String toLowerCase()
        String x9 = "A New Moon";
        System.out.println(x9.toLowerCase());      //  output is
        //  "a new moon"
        //  P438
        //  public String toString()
        String x10 = "big surprise";
        System.out.println(x10.toString());       //  output -
        //  reader's exercise
        //  public String toUpperCase()
        String x11 = "A New Moon";
        System.out.println(x11.toUpperCase());    //  output is
        //  "A NEW MOON"
        //  public String trim()
        String x12 = "    hi      ";
        System.out.println(x12 + "x12");            //  result is
        //  "   hi      x"
        System.out.println(x12.trim() + "x12");       //  result is "hix"
    }
}

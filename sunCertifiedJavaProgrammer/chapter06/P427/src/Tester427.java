//	Sun Certified Java Programmer
//	Chapter 6, P427
//  Strings, I/O, Formatting, and Parsing

class Tester427 {
    public static void main(String[] args) {
        //  P427
        String s = new String();
        s = "abcdef";
        System.out.println(s);
        /*String s = new String ("abcdef");
        System.out.println(s);*/
        /*String s = "abcdef";
        System.out.println(s);
        String s2 = s;      //  refer s2 to the same String as s
        System.out.println(s2);
        s = s.concat(" more stuff");    //  the concat() method 'appends'
                                        //  a literal to the end
        System.out.println(s);*/
        //  P428
        /*String s = "abcdef";    //  create a new String object, with
                                //  value "abcdef", refer s to it
        String s2 = s;          //  create a 2nd reference variable
                                //  referring to the same String
        System.out.println(s);
        System.out.println(s2);

        //  create a new String object, with value "abcdef more stuff",
        //  refer s to it.  (Change s's reference from the old String
        //  to the new String.)  (Remember s2 is still reffering to
        //  the original "abcdef" String.)
        s = s.concat(" more stuff");
        System.out.println(s);*/
    }
}

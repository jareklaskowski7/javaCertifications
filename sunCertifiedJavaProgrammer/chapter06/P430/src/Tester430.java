//	Sun Certified Java Programmer
//	Chapter 6, P430
//  Strings, I/O, Formatting, and Parsing

class Tester430 {
    public static void main(String[] args) {
        //  P430
        String x = "Java";
        x.concat(" Rules!");
        System.out.println("x = " + x);     //  the output is "x = Java"
        //  P431
        x.toUpperCase();
        System.out.println("x = " + x);     //  the output is still:                                            //  x = Java
        x.replace('a', 'X');
        System.out.println("x = " + x);     //  the output is still:
        //  x = Java
        /*String x = "Java";
        x = x.concat(" Rules!");            //  Now we're assigning the
                                            //  new String to x
        System.out.println("x = " + x)*/     //  the output will be:
        //  x = Java Rules!
        //  P432
        /*String x = "Java";
        x = x.concat(" Rules!");
        System.out.println("x = " + x);     //  the output is:
                                            //  x = Java Rules!
        x.toLowerCase();                    //  no assignment, create a
                                            //  new, abandoned String
        System.out.println("x = " + x);     //  no assignment, the output
                                            //  is still: x = Java Rules!
        x = x.toLowerCase();                //  creater a new String,
                                            //  assigned to x
        System.out.println("x = " + x);*/     //  the assignment causes the
        //  output: x = java rules!
        //  P433
        String s1 = "spring ";
        String s2 = s1 + "summer ";
        s1.concat("fall ");
        s2.concat(s1);
        s1 += "winter ";
        System.out.println(s1 + " " + s2);
    }
}

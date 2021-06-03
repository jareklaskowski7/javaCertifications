//	Sun Certified Java Programmer
//	Chapter 6, P439
//  Strings, I/O, Formatting, and Parsing

class Tester439 {
    public static void main(String[] args) {
        //  P439
        //  Using StringBuilder and StringBuffer
        String x1 = "abc";
        x1.concat("def");
        System.out.println("x1 = " + x1);     //  output is "x1 = abc"
        String x2 = "abc";
        x2 = x2.concat("def");
        System.out.println("x2 = " + x2);     //  output is "x2 = abcdef"
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append("def");
        System.out.println("sb1 = " + sb1);   //  output is "sb1 = abcdef"
        //  P440
        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("def").reverse().insert(3, "---");
        System.out.println(sb2);           //  output is "fed---cba"

        //  public synchronized StringBuffer append(String s)
        StringBuffer sb3 = new StringBuffer("set ");
        sb3.append("point");
        System.out.println(sb3);         //  output is "set point"
        StringBuffer sb4 = new StringBuffer("pi = ");
        sb4.append(3.14159f);
        System.out.println(sb4);        //  output is "pi = 3.14159"

        //  public StringBuilder delete(int start,int end)
        StringBuilder sb5 = new StringBuilder("0123456789");
        System.out.println(sb5.delete(4, 6));    //  output is "01236789"

        //  P441
        //  Exam watch!
        StringBuffer sb6 = new StringBuffer("abc");
        sb6.append("def");
        System.out.println(sb6);

        //  public StringBuilder insert(int offset,String s)
        StringBuilder sb7 = new StringBuilder("01234567");
        sb7.insert(4, "---");
        System.out.println(sb7);       //  output is "0123---4567"

        //  public synchronized StringBuffer reverse()
        StringBuffer sb8 = new StringBuffer("A man a plan a canal Panama");
        sb8.reverse();
        System.out.println(sb8);       //  output: "amanaP lanac a nalp a nam A"

        //  public String toString()
        StringBuffer sb9 = new StringBuffer("test string");
        System.out.println(sb9.toString());    //  output is "test string"

        //  P442
        //result = method1().method2().method3();
        String x = "abc";
        String y = x.concat("def").toUpperCase().replace('C', 'x');
        //  chained methods
        System.out.println("y = " + y);     //  result is "y = ABxDEF"
    }
}

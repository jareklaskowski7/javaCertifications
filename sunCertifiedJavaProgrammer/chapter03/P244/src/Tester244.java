//	Sun Certified Java Programmer
//	Chapter 3, P244
//  Assignments

class Tester244 {
    public static void main(String[] args) {
        //  P244f
        /*Integer y = new Integer(567);   //  make it
        int x = y.intValue();           //  unwrap it
        x++;                            //  use it
        y = new Integer(x);             //  re-wrap it
        System.out.println("y = " + y); //  print it*/


        /*Integer y = new Integer(567);   //  make it
        y++;                            //  unwrap it, increment it,
                                        //  rewrap it
        System.out.println("y = " + y); //  print it*/


        Integer y = 567;                    //  make a wrapper
        Integer x = y;                      //  assign a second ref
        //  var to THE wrapper

        System.out.println(y == x);           //  verify that they refer
        //  to the same object
        //y++;                                //  unwrap, use, "rewrap"

        //  y++     substitute
        int x2 = y.intValue();              //  unwrap it
        x2++;                               //  use it
        y = new Integer(x2);                //  re-wrap it*/

        System.out.println(x + " " + y);    //  print values

        System.out.println(y == x);           //  verify that they refer
        //  to different objects*/
    }
}

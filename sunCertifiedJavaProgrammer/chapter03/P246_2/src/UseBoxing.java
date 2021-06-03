//	Sun Certified Java Programmer
//	Chapter 3, P246_2
//  Assignments

class UseBoxing {
    public static void main(String[] args) {
        UseBoxing u = new UseBoxing();
        u.go(5);
    }

    boolean go(Integer i)               //  boxes the int it was passed
    {
        Boolean ifSo = true;            //  boxes the literal
        Short s = 300;                  //  boxes the primitive
        if (ifSo)                       //  unboxing
        {
            System.out.println(++s);    //  unboxes, increments, reboxes
        }
        System.out.println(s);
        System.out.println(ifSo);
        System.out.println(i);
        return !ifSo;                   //  unboxes, returns the inverse
    }
}

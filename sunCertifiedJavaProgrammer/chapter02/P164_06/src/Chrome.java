//	SCJPP164_06
//	Chapter 2: Object Orientation

class Chrome
{
    public static void main(String[] args)
    {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        //  insert code here
        x2.do2();         //  A
        (Y)x2.do2();      //  B
        ((Y)x2).do2();    //  C
        //None of the above statements will compile     D
    }
}
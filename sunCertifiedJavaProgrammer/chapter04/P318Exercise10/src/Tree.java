//	SCJPP313Exercise10
//	Chapter 4: Operators

public class Tree
{
    public static void main(String[] args)
    {
        String s = "0";
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();
        if ((b instanceof Vessel) && (b2 instanceof Toy))    s += "1";
        if ((s2 instanceof Vessel) && (s2 instanceof Toy))   s += "2";
        System.out.println(s);
        Speedboat s3 = (Speedboat)b2;
        
        if (
        (s3 instanceof Object) &
        (s3 instanceof Boat) &
        (s3 instanceof Speedboat) &
        (s3 instanceof Vessel) &
        (s3 instanceof Toy)
        )
        { System.out.println("s3 is downcasted"); }
    }
}
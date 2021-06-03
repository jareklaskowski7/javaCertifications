//	SCJPP167_11
//	Chapter 2: Object Orientation

public class SubSubAlpha extends Alpha
{
    private SubSubAlpha()
    {
    	s += "subsub ";
    }
    public static void main(String[] args)
    {
        new SubSubAlpha();
        System.out.println(s);
    }
}
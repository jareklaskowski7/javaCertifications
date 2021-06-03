//	SCJPP166_10
//	Chapter 2: Object Orientation

public class Tenor extends Singer
{
    public static String sing()
    {
    	return "fa";
    }
    public static void main(String[] args)
    {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }
}
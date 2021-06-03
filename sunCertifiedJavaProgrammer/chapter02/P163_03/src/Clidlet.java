//	SCJPP163_03
//	Chapter 2: Object Orientation

public class Clidlet extends Clidder
{
    public final void flipper()
    {
    	System.out.println("Clidlet");
    }
    public static void main(String[] args)
    {
        new Clidlet().flipper();
    }
}
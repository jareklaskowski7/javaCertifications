//	SCJPP167_12
//	Chapter 2: Object Orientation

public class House extends Building
{
    House()
    {
    	System.out.print("h ");	
    }
    House(String name)
    {
        this();
        System.out.print("hn " + name);
    }
    public static void main(String[] args)
    {
    	new House("x ");	
    }
}
//	SCJPP168_13
//	Chapter 2: Object Orientation

public class ZooKeeper
{
    public static void main(String[] args)
    {
    	new ZooKeeper().go();
    }
    void go()
    {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}
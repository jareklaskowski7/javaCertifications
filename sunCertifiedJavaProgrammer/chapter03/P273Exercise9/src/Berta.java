//	SCJPP273Exercise9
//	Chapter 3: Assignments

public class Berta
{
	static String s = "";
	public static void main(String[] args)
    {
		int x = 4; Boolean y = true; short[] sa = {1, 2, 3};
		doStuff(x, y);
		doStuff(x);
		doStuff(sa, sa);
		System.out.println(s);
    }
	static void doStuff(Object o)        { s += "1"; }
	static void doStuff(Object... o)     { s += "2"; }
	static void doStuff(Integer... i)    { s += "3"; }
	static void doStuff(Long L)          { s += "4"; }
}
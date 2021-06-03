//	SCJPP316Exercise6
//	Chapter 4: Operators

public class Twisty
{
    { index = 1; }
    int index;
    public static void main(String[] args)
    {
        new Twisty().go();
    }
    void go()
    {
        int[][] dd = {{9,8,7}, {6,5,4}, {3,2,1,0}};
        System.out.println(dd[index++][index++]);
    }
}
//	SCJPP165_08
//	Chapter 2: Object Orientation

public class DogShow
{
    public static void main(String[] args)
    {
    	new DogShow().go();	
    }
    void go()
    {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        ((Dog) new Hound()).sniff();
    }
}
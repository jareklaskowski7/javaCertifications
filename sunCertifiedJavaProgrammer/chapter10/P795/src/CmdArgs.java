//	Sun Certified Java Programmer
//	Chapter 10; P795
//  Development

public class CmdArgs {
    public static void main(String[] args) {
        int x = 0;
        for (String s : args)
            System.out.println(x++ + " element = " + s);
    }
}

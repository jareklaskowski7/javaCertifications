//	Sun Certified Java Programmer
//	Chapter 10; P806_2
//  Development

import static java.lang.System.out; // 1
import static java.lang.Integer.*;  // 2

public class TestStaticImport {
    public static void main(String[] args) {
        out.println(MAX_VALUE);       // 3
        out.println(toHexString(42)); // 4
    }
}

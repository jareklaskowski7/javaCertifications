//  Sun Certified Java Programmer
//	Chapter 10; P815_8
//  Development

import java.util.*;

public class Values {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.setProperty("myProp", "myValue");
        System.out.print(p.getProperty("cmdProp") + " ");
        System.out.print(p.getProperty("myProp") + " ");
        System.out.print(p.getProperty("noProp") + " ");
        p.setProperty("cmdProp", "newValue");
        System.out.println(p.getProperty("cmdProp"));
    }
}

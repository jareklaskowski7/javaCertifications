//	Sun Certified Java Programmer
//	Chapter 6, P501
//  Strings, I/O, Formatting, and Parsing

import java.util.*;

class ScanIn {
    public static void main(String[] args) {
        System.out.print("input: ");
        System.out.flush();
        try {
            Scanner s = new Scanner(System.in);
            String token;
            do {
                token = s.findInLine(args[0]);
                System.out.println("found " + token);
            } while (token != null);
        } catch (Exception e) {
            System.out.println("scan exc");
        }
    }
}

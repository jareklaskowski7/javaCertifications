//	Sun Certified Java Programmer
//	Chapter 8; P678
//  Inner Classes

public class Tester678 {
    public static void main(String[] args) {
        Runnable r = new Runnable();        //  can't instantiate interface

        /*Runnable r = new Runnable() {       //  curly brace, not semicolon
            public void run() { }
        };*/
    }
}

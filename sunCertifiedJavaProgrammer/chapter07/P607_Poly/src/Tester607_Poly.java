//	Sun Certified Java Programmer
//	Chapter 7, P607_Poly
//  Generics and Collections

import java.util.*;

public class Tester607_Poly {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();

        class Parent {
        }
        class Child extends Parent {
        }
        List<Parent> myList = new ArrayList<Child>();
    }
}

//	Sun Certified Java Programmer
//	Chapter 7, P596_597
//  Generics and Collections

import java.util.*;

public class Tester596_597 {
    public static void main(String[] args) {
        //  P596
        //ArrayList myList = new ArrayList();
        //List myList = new ArrayList();

        //  P597
        //List myList = new ArrayList();          //  can't declare a type

        //myList.add("Fred");                     //  OK, it will hold Strings

        //myList.add(new Dog());                  //  and it will hold Dogs too

        //myList.add(new Integer(42));            //  and Integers...


        //String s = (String) myList.get(0);

        List<String> myList = new ArrayList<String>();
        myList.add("Fred");                     //  OK, it will hold Strings
        //myList.add(new Dog());                  //  compiler error!!

        //  P598
        //String s = (String)myList.get(0);           //  pre-generics, when a
        //  String wasn't guaranteed

        //String s = myList.get(0);

        for (String s : myList) {
            int x = s.length();
            //  no need for a cast before calling a String method!  The
            //  compiler already knew "s" was a String coming from MyList
        }

    void takeListOfStrings(List<String> strings) {
        strings.add("foo");                     //  no problem adding a String
    }

    void takeListOfStrings(List<String> strings) {
        strings.add(new Integer(42));           //  NO!!  strings is type safe
    }

    //  P599
        /*public List<Dog> getDogList() {
            List<Dog> dogs = new ArrayList<Dog>();
            //  more code to insert dogs
            return dogs;
        }

        Dog d = getDogList().get(0);                //  we KNOW a Dog is coming out

        public List getDogList() {
            List dogs = new ArrayList();
            //  code to add only Dogs... fingers crossed...
            return dogs;                            //  a List of ANYTHING will work here
        }

        Dog d = (Dog) getDogList().get(0);

        List myList = new ArrayList();              //  old-style, non-generic

        List<Object> myList = new
                ArrayList<Object>();                //  holds ANY object type
         */
}
}

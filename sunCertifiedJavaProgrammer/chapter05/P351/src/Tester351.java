//	Sun Certified Java Programmer
//	Chapter 5, P351
//  Flow Control, Exceptions, and Assertions

class Tester351 {
    public static void main(String[] args) {
        // for(declaration : expression)
        int x;
        long x2;
        Long[] La = {4L, 5L, 6L};
        long[] la = {7L, 8L, 9L};
        int[][] twoDee = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] sNums = {"one", "two", "three"};
        Animal[] animals = {new Dog(), new Cat()};
        //  legal 'for' declarations
        for (long y : la) ;          //  loop thru an array of longs
        for (long lp : La) ;         //  autoboxing the Long objects into longs
        for (int[] n : twoDee) ;     //  loop thru the array of arrays
        for (int n2 : twoDee[2]) ;   //  loop thru the 3rd sub-array
        for (String s : sNums) ;     //  loop thru the array of Strings
        for (Object o : sNums) ;     //  set an Object reference to each String
        for (Animal a : animals) ;   //  set an Animal reference to each element
        //  ILLEGAL 'for' declarations
        for (x2:
             la)
            ;              //  x2 is already declared
        for (int x2 : twoDee) ;      //  can't stuff an array into an int
        for (int x3 : la) ;          //  can't stuff a long into an int
        for (Dog d : animals) ;      //  you might get a Cat!
    }
}

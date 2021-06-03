//	Sun Certified Java Programmer
//	Chapter 5, P333
//  Flow Control, Exceptions, and Assertions

class Tester333 {
    public static void main(String[] args) {
        int trueInt = 1;
        int falseInt = 0;
        if (trueInt)            //  illegal
            if (trueInt == true)    //  illegal
                if (1)                  //  illegal
                    if (falseInt == false)  //  illegal
                        if (trueInt == 1)       //  legal
                            if (falseInt == 0) ;     //  legal
    }
}

//	Sun Certified Java Programmer
//	Chapter 5, P381
//  Flow Control, Exceptions, and Assertions

class Tester381 {
    public static void main(String[] args) {
        int parseInt (String s)throws NumberFormatException {
            boolean parseSuccess = false;
            int result = 0;
            //  do complicated parsing
            if (!parseSuccess)  //  if the parsing failed
                throw new NumberFormatException();
            return result;
        }
    }
}

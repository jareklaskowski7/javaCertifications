//	Sun Certified Java Programmer
//	Chapter 3, P246
//  Assignments

class Tester246 {
    public static void main(String[] args) {
        Integer i3 = 10;
        Integer i4 = 10;
        if (i3 == i4) System.out.println("same object");
        if (i3.equals(i4)) System.out.println("meaningfully equal");
    }
}

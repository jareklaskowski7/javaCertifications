//	Sun Certified Java Programmer
//	Chapter 3, P215_2
//  Assignments

class ReferenceTest {
    public static void main(String[] args) {
        int a = 1;
        ReferenceTest rt = new ReferenceTest();
        System.out.println("Before modify() a = " + a);
        rt.modify(a);
        System.out.println("After modify() a = " + a);
    }

    void modify(int number) {
        number = number + 1;
        System.out.println("number = " + number);
    }
}

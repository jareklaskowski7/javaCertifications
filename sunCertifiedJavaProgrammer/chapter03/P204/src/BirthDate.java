//	Sun Certified Java Programmer
//	Chapter 3, P204
//  Assignments

public class BirthDate {
    int year;  //  Instance variable

    public static void main(String[] args) {
        BirthDate bd = new BirthDate();
        bd.showYear();
    }

    public void showYear() {
        System.out.println("The year is " + year);
    }
}

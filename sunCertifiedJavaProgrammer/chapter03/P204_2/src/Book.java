//	Sun Certified Java Programmer
//	Chapter 3, P204_2
//  Assignments

public class Book {
    private String title;   //  instance reference variable

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book b = new Book();
        System.out.println("The title is " + b.getTitle());
    }
}

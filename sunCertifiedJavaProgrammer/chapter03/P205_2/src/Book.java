//	Sun Certified Java Programmer
//	Chapter 3, P205_2
//  Assignments

public class Book {
    private String title;   //  instance reference variable

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book b = new Book();
        String s = b.getTitle();  //  Compiles and runs
        System.out.println("s = " + s);
        if (s != null) {
            String t = s.toLowerCase();
        }
    }
}

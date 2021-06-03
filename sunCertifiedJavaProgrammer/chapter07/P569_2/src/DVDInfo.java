//	Sun Certified Java Programmer
//	Chapter 7, P569_2
//  Generics and Collections

class DVDInfo {
    String title;
    String genre;
    String leadActor;

    DVDInfo(String t, String g, String a) {
        title = t;
        genre = g;
        leadActor = a;
    }

    public String toString() {
        return title + " " + genre + " " + leadActor + "\n";
    }
    //  getters and setter go here
}

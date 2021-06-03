//	Sun Certified Java Programmer
//	Chapter 7, P573
//  Generics and Collections

class DVDInfo implements Comparable<DVDInfo> {
    String title;
    String genre;
    String leadActor;

    DVDInfo(String t, String g, String a) {
        title = t;
        genre = g;
        leadActor = a;
    }

    @Override
    public String toString() {
        return title + " " + genre + " " + leadActor + "\n";
    }

    public int compareTo(DVDInfo d) {
        return title.compareTo(d.getTitle());
    }

    public String getTitle() {
        return title;
    }
    //  other getters and setters go here
}

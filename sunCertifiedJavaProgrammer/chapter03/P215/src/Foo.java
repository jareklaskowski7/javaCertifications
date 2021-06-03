//	Sun Certified Java Programmer
//	Chapter 3, P215
//  Assignments

class Foo {
    String s;

    void bar() {
        Foo f = new Foo();
        doStuff(f);
    }

    void doStuff(Foo g) {
        g.setName("Boo");
        g = new Foo();
    }

    public void setName(String s) {
        this.s = s;
    }

    public String getName() {
        return s;
    }
}

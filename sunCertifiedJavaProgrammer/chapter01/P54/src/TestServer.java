//	Sun Certified Java Programmer
//	Chapter 1, P54
//  Declarations and Access Control

class TestServer {
    public void logIn() {
        int count = 10;
    }

    public void doSomething(int i) {
        count = i;  //  Won't compile!  Can't access count outside method logIn()
    }
}

// A
// The Rabbit object from line 3 is first eligible for garbage collection immediately following line 6
// B
// The Rabbit object from line 3 is first eligible for garbage collection immediately following line 8
// C
// The Rabbit object from line 3 is first eligible for garbage collection immediately following line 12
// D
// The Rabbit object from line 4 is first eligible for garbage collection immediately following line 9
// E
// The Rabbit object from line 4 is first eligible for garbage collection immediately following line 11
// F
// The Rabbit object from line 4 is first eligible for garbage collection immediately following line 12

public class Rabbit {
    public static void main(String[] args) {
        Rabbit one = new Rabbit();
        Rabbit two = new Rabbit();
        Rabbit three = one;
        one = null;
        Rabbit four = one;
        three = null;
        two = null;
        two = new Rabbit();
        System.gc();
    } }

//	Sun Certified Java Programmer
//	Chapter 2, P127_2
//  Object Orientation

class Beta extends Alpha {
    Beta doStuff(char c) {   //  legal override in Java 1.5
        return new Beta();
    }
}

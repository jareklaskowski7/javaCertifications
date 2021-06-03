//	Sun Certified Java Programmer
//	Chapter 7, P626
//  Generics and Collections

public class TestGenerics<T> {      //  as the class type
    T anInstance;                  //  as an instance variable type
    T[] anArrayOfTs;               //  as an array type

    TestGenerics(T anInstance) {
        this.anInstance = anInstance;
    }

    T getT() {                      //  as a return type
        return anInstance;
    }
}

//	Sun Certified Java Programmer
//	Chapter 7, P628_629
//  Generics and Collections

public class Tester628_629 {
    public static void main(String[] args) {
        // P628
        public <T> void makeArrayList(T t)

        public <T extends Number> void makeArrayList(T t)

        public void makeList(T t) { }

        public class Radio {
            public <T> Radio(T t) { }   //  legal constructor
        }

        //  P629
        class X { public <X> X(X x) { } }



        public class NumberHolder<? extends Number> { }

        public class NumberHolder<?> { ? aNum; }       //  NO!

        public class NumberHolder<T> { T aNum; }       //  Yes

    }
}

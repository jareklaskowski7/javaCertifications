//	Sun Certified Java Programmer
//	Chapter 7, P608_2
//  Generics and Collections

import java.util.*;

public class TestPoly {
    public static void main(String[] args) {
        Parent[] myArray = new Child[3];                //  yes

        //  P609
        Object[] myArray = new JButton[3];              //  yes

        List<Object> list = new ArrayList<JButton>();   //  NO!
    }
}

// A
//java BirdDisplay Sparrow Blue Jay
// B
//java BirdDisplay Sparrow "Blue Jay"
// C
//java BirdDisplay Blue Jay Sparrow
// D
//java BirdDisplay "Blue Jay" Sparrow
// E
//java BirdDisplay.class Sparrow "Blue Jay"
// F
//java BirdDisplay.class "Blue Jay" Sparrow
// G
// Does not compile
public class BirdDisplay {
    public static void main(String[] name) {
        System.out.println(name[1]);
    }
}

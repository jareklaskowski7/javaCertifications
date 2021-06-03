public class ReviewQuestion06 {
    public static void main(String[] args) {
        int x = 4;
        int y = x * 4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        else System.out.println("Too High");
    }
}

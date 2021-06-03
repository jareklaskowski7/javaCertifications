public class AssessmentTest05 {
    public static void main(String[] main) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");
    }
}

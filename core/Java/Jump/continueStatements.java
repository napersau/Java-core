package Jump;

public class continueStatements {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop completed.");
    }
}

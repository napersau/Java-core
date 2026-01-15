package Jump;

public class returnStatements {
    public static int add(int x, int y) {
        return x + y; // Return the sum of x and y
    }
    public static void main(String[] args) {
        System.out.println("Before return statement.");
        return; // Exit the method
    }
}

package controlStatements;

public class Switch {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 5:
                System.out.println("x is 5");
                break;
            case 10:
                System.out.println("x is 10");
                break;
            case 15:
                System.out.println("x is 15");
                break;
            default:
                System.out.println("x is neither 5, 10, nor 15");
        }
    }
}

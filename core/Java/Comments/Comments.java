package Comments;

public class Comments {
    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("Hello, World!"); // Print greeting message

        /*
         This is a multi-line comment.
         It can span multiple lines.
        */
        System.out.println("Comments in Java.");
    }

    /**
     * This is a Javadoc comment.
     * It is used to generate documentation for the method.
     * @param name
     * @return
     */
    public static void print(String name){
        System.out.println("Name: " + name);
    }
}

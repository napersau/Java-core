package Variables;

public class Reference {
    String str = "Hello world";
    public void print(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Reference ref = new Reference();
        ref.print();
    }
}

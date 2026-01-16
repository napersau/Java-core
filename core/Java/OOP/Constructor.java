package OOP;

public class Constructor {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setId(1L);
        dog.setName("Buddy");

        dog.breed = "Golden Retriever";
        Dog dog2 = new Dog(1L, "Tommy", "kaka");

    }
}

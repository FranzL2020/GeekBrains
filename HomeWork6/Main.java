package homework6;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat(), new Dog(), new Dog(), new Cat()
        };

        System.out.println("Animals: " + Animal.counter);
        System.out.println("Dogs: " + Dog.counter);
        System.out.println("Cats: " + Cat.counter);

    }
}

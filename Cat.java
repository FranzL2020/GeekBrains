package homework6;

public class Cat extends Animal {

    public static int counter;

    public Cat(int maxRunDistance) {
        super(200, -1);
        counter++;
    }

    public Cat() {
        this(200);
    }

    @Override
    public void run(int distance) {
        if (getMaxRunDistance() <= distance) {
            System.out.println("Dog passed run distance: " + distance);
        } else {
            System.out.println(String.format("Distance: %s is feasible. Ma distance to run: %s", distance, getMaxRunDistance()));
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats do not want to swim: )");


    }
}
package homework6;

public class Dog extends Animal {

    public static int counter;

    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
        counter++;
    }

    public Dog() {
        this(500, 20);
    }

    @Override
    public void run(int distance) {
        if (getMaxRunDistance() <= distance) {
            System.out.println("Dog passed run distance: " + distance);
        } else {
            System.out.println(String.format("Run Distance for dog: %s is feasible. Ma distance to run: %s", distance, getMaxRunDistance()));
        }
    }

    @Override
    public void swim(int distance) {
        if (getMaxRunDistance() <= distance) {
            System.out.println("Dog passed swim di distance: " + distance);
        } else {
            System.out.println(String.format("Run Distance for dog: %s is feasible. Ma distance to run: %s", distance, getMaxSwimDistance()));
        }

    }
}
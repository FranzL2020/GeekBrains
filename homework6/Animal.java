package homework6;

public abstract class Animal {

    public static int counter;

    private final int maxRunDistance;
    private final int maxSwimDistance;


    public Animal(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        counter++;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);


}
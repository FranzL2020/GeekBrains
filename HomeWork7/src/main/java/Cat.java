public class Cat {

    private final String name;
    private boolean isFed;

    public Cat(String name) {
        this.name = name;
    }

    public void eat (Plate plate){
        isFed = plate.decreaseFood(3);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", isFed=" + isFed +
                '}';
    }
}

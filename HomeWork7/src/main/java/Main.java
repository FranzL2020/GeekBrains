public class Main{
    public static void main(String[] args) {
        doArrayCats();
    }

    static void doArrayCats (){
        Cat [] cats = {
                new Cat("Jora"),
                new Cat ("Max"),
                new Cat ("Barsik"),
                new Cat ("Musa"),
        };

        Plate plate = new Plate ();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i]);
        }
    }
}
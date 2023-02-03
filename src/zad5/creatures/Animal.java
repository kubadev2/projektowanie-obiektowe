package zad5.creatures;

public class Animal {
    private Double weight;
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 3.5;
    private static final Double DEFAULT_LION_WEIGHT = 200.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    private static final Double DEFAULT_WEIGHT_LOOSE = 1.0;
    private static final Double DEFAULT_DISTANCE = 1.0;
    private static final Double DEFAULT_RUN_LOOSE = 1.5;
    private static final boolean DEFAULT_IFRUN = false;
    String species;
    boolean isAlive;
    String name;

    public Animal(String species) {
        this.species = species;
        this.isAlive = true;
        this.name = "Szarik";

        switch (species) {
            case "canis":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "felis":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "african":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
                break;
        }
    }

    public Animal() {
    }


    public void feed() {
        if (this.isAlive) {
            this.weight += 1.0;
            System.out.println("Masa zwiekszona");
        } else
            System.out.println("Daj spokoj, zwierze nie zyje");
    }

    public void walk() {
        this.walk(DEFAULT_DISTANCE, DEFAULT_IFRUN);
    }

    public void walk(Double distance) {
        this.walk(distance, DEFAULT_IFRUN);
    }

    public void walk(Double distance, Boolean ifRun) {
        if (this.isAlive) {
            if (ifRun)
                this.weight -= DEFAULT_WEIGHT_LOOSE * distance * DEFAULT_RUN_LOOSE;
            else
                this.weight -= DEFAULT_WEIGHT_LOOSE * distance;
            System.out.println("Masa zmniejszona");
            System.out.println(this.weight);
            if (this.weight <= 0) {
                this.isAlive = false;
                System.out.println("Zwierze nie zyje");
            }
        } else
            System.out.println("Daj spokoj, zwierze nie zyje");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}

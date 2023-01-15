package zad4;

public class Animal
{
    private Double weight;
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 3.5;
    private static final Double DEFAULT_LION_WEIGHT = 200.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    final String species;
    Boolean isAlive;
    String name;

    public Animal(String species)
    {
        this.species = species;
        this.isAlive = true;
        this.name = "Szarik";

        switch(species)
        {
            case "canis": this.weight = DEFAULT_DOG_WEIGHT; break;
            case "felis": this.weight = DEFAULT_CAT_WEIGHT; break;
            case "african": this.weight = DEFAULT_LION_WEIGHT; break;
            default: this.weight = DEFAULT_WEIGHT; break;
        }
    }

    public void feed()
    {
        if  (this.isAlive)
        {
            this.weight += 1.0;
            System.out.println("Masa zwiekszona");
        }
        else
            System.out.println("Daj spokoj, zwierze nie zyje");
    }
    public void walk()
    {
        if  (this.isAlive)
        {
            this.weight -= 1.0;
            System.out.println("Masa zmniejszona");
            if (this.weight <= 0)
            {
                this.isAlive = false;
                System.out.println("Zwierze nie zyje");
            }
        }
        else
            System.out.println("Daj spokoj, zwierze nie zyje");
    }

}

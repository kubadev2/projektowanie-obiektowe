package zad5.creatures;

public class FarmAnimal extends Animal implements Eatable {

    public FarmAnimal() {
        super();
    }

    public void beEaten(){
        this.isAlive = false;
    };

    public void feed(){
        this.weight = weight + 1.0;
    };

    public void feed(Double foodWeight){
        this.weight = weight + foodWeight;
    };
}

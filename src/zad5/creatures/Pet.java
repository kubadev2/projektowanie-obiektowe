package zad5.creatures;

public class Pet extends Animal {

    public Pet() {
        super();
    }
    public void feed(){
        this.weight = weight + 1.0;
    }

    public void feed(Double foodWeight){
        this.weight = weight + foodWeight;
    }
}

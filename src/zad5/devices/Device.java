package zad5.devices;

public abstract class Device {

    public final String model;
    public final String producer;
    public final int yearOfProduction;
    public Double value;


    public abstract void sell(Human seller, Human buyer, double price);


    public abstract void turnOn();

    public Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

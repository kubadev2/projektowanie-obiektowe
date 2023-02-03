package zad5.devices;

public class Car
{
    public final String model;
    public final String producer;
    public String color;
    public String engine;
    public Double value;

    public Car(String producer, String model, String engine, Double value)
    {
        this.producer=producer;
        this.model=model;
        this.engine=engine;
        this.value=value;
    }

    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        return this.producer.equals(otherCar.producer);
    }

    @Override
    public String toString(){//overriding the toString() method
        return ("Producent: " +producer+ " Model: "+model+" Silnik: "+engine+" Wartosc: "+value+" Kolor:"+color);
    }
}


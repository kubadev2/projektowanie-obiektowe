package zad5.devices;

public class Car extends Device {

    public String color;
    public String engine;
    public Double value;

    public Car(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }


    @Override
    public void turnOn() {

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


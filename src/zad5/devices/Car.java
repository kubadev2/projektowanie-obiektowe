package zad5.devices;
import zad5.Human;


public class Car extends Device {

    public String color;
    public String engine;
    public Boolean isWork=false;

    public Car(String producer, String model, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }
    @Override
    public void sell(Human seller , Human buyer, double price)
    {
        if(seller.getCar() == this && buyer.cash >= price) {
            System.out.println("Transakcja przebiegła pomyślnie");
            buyer.setCar(this);
            seller.setCar(null);
            seller.cash += price;
            buyer.cash -= price;
            System.out.println("Stare samochód znudził mi się to oczywiście go wyrzuciłem wyrzuciłem :)");
        }
        else
            System.out.println("Nie można przeprowadzić transakcji");
    }
    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getCar() == this && buyer.cash >= price) {
            System.out.println("Transakcja przebiegła pomyślnie");
            buyer.setCar(this);
            seller.setCar(null);
            seller.cash += price;
            buyer.cash -= price;
            System.out.println("Stare samochód znudził mi się to oczywiście go wyrzuciłem wyrzuciłem :)");
        }
        else
            System.out.println("Nie można przeprowadzić transakcji");
    }
    @Override
    public void turnOn() {
        this.isWork = true;
    }


    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        return this.producer.equals(otherCar.producer);
    }

    @Override
    public String toString() {//overriding the toString() method
        return ("Producent: " + producer + " Model: " + model + " Silnik: " + engine + " Wartosc: " + value + " Kolor:" + color);
    }

}

    @Override
    public void turnOn() {
        this.isWork = true;
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


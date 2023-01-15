package zad5;

public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Audi", "TT", "1.8T", 20000.0);
        Car car2 = new Car("Ferrari", "Testarossa", "5", 1000000.0);

        car1.color="black";
        car2.color="red";


        System.out.println("Samochod 1:");
        System.out.println(car1.producer);
        System.out.println(car1.model);
        System.out.println(car1.engine);
        System.out.println(car1.color+"\n");

        System.out.println("Samochod 2:");
        System.out.println(car2.producer);
        System.out.println(car2.model);
        System.out.println(car2.engine);
        System.out.println(car2.color+"\n");

        Human me = new Human(2001);
        me.setSalary(8000.0);
        me.getSalary();
        me.setCar(car1);
        me.getCar(car1);


        Animal dog = new Animal("canis");
        me.pet = dog;

        dog.feed();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.feed();
    }
}
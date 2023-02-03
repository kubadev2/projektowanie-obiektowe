package zad5;

import zad5.devices.Car;
import zad5.devices.Phone;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phone nokia = new Phone();
        List<String> apps = new ArrayList<>();
        apps.add("fb");
        apps.add("gta");
        apps.add("youtube");
        //nokia.installAnApp(apps);
        System.out.println(nokia);
        try {
            URL url = new URL("https", "appserver.com", "whatsapp");
            //nokia.installAnApp(url);
        } catch (Exception e) {
            //to się wykona jeśli będzie błąd
            System.out.println("Sory ale nie udało się zainstalować");
        }

        Car car1 = new Car("Audi", "TT", "1.8T", 20000.0);
        Car car2 = new Car("Ferrari", "Testarossa", "5", 1000000.0);
        Car car3 = new Car("Ferrari", "Testarossa", "5", 1000000.0);

        car1.color = "black";
        car2.color = "red";
        car3.color = "red";

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());


        System.out.println(car1.producer + " oraz " + car2.producer + " są takie same: " + car1.equals(car2));
        System.out.println(car2.producer + " oraz " + car3.producer + " są takie same: " + car2.equals(car3));
        System.out.println(car3);


        System.out.println("Samochod 1:");
        System.out.println(car1.producer);
        System.out.println(car1.model);
        System.out.println(car1.engine);
        System.out.println(car1.color + "\n");

        System.out.println("Samochod 2:");
        System.out.println(car2.producer);
        System.out.println(car2.model);
        System.out.println(car2.engine);
        System.out.println(car2.color + "\n");

        Human me = new Human(2001);
        me.setSalary(8000.0);
        me.getSalary();
        me.setCar(car1);
        me.getCar(car1);

        me.feed();

        Animal dog = new Animal("canis");
        me.pet = dog;


        dog.feed();
        dog.walk(10.00, true);
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
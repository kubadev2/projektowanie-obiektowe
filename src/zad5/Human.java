package zad5;

import zad5.creatures.Animal;
import zad5.devices.Car;
import zad5.devices.Phone;

public abstract class Human extends Animal
{
    Animal pet;
    String firstName;
    String lastName;
    public Phone phone;
    public Car car;
    private Double salary;
    final Integer yearOfBirth;
    Human(Integer yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

    public void feed()
    {
        System.out.println("jem zupę");
    }

    public Void getSalary()
    {
        System.out.println(this.salary.toString());
        return null;
    }

    public String setSalary(Double salary)
    {
        if (salary>=0)
        {
            this.salary = salary;
            System.out.println
                    (
                            "Twoje dane zostaly wyslane do systemu ksiegowego\n" +
                                    "Proszę odebrac aneks do umowy od pani Hani z kadr\n" +
                                    "Nie ma sensu ukrywac dochodu, bo ZUZ i US wiedza o zmianie wysokosci wynagrodzenia"
                    );
        }
        else
            System.out.println("Watrosc wynagrodzenia nie moze byc mniejsz niz 0!");
        return null;
    }
    public Car getCar()
    {
        return car;
    }
    public void setCar(Car car)
    {
        this.car = car;
    }
    public Animal getAnimal()
    {
        return pet;
    }
    public  void setAnimal(Animal animal){

        this.pet= animal;
    }
    public Phone getPhone()
    {
        return phone;
    }
    public  void setPhone(Phone phone)
    {
        this.phone = phone;
    }

}

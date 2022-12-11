public class Human
{
    Animal pet;
    String firstName;
    String lastName;
    private Car car;
    private Double salary;
    final Integer yearOfBirth;
    Human(Integer yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

    public Void getSalary()
    {
        System.out.println(this.salary.toString());
        return null;
    }

    public String setSalary(double salary)
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
    public String getCar(Car car1)
    {
        return (this.car.toString());
    }
    public Void setCar(Car car)
    {
        if(this.salary > car.value)
        {
            System.out.println("Udalo ci sie kupic samochod za gotowke");
            this.car = car;
        }
        else if (this.salary > car.value/12)
        {
            System.out.println("Udalo ci sie kupic samochod na kredyt");
            this.car = car;
        }
        else
            System.out.println("Nie stac cie na samochod");
        return null;
    }
}

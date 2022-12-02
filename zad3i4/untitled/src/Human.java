public class Human
{
    Animal pet;
    String firstName;
    String lastName;
    Car car;
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
}

package main;

import lombok.Data;

@Data
public class Person {
    private String Name;
    private String Surname;
    private String Phone;

    public Person(String name, String surname, String phone)
    {
        this.Name = name;
        this.Surname = surname;
        this.Phone = phone;
    }

    @Override
    public String toString() {
        return "Ім'я: "+ this.Name + "; Прізвище: "
                + this.Surname + "; Номер телефону: "
                + this.Phone;
    }
}
